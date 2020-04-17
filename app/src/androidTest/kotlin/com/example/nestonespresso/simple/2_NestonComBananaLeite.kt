package com.example.nestonespresso.simple

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import br.com.concretesolutions.kappuccino.actions.TextActions
import br.com.concretesolutions.kappuccino.assertions.EnableAssertions.notEnabled
import br.com.concretesolutions.kappuccino.assertions.VisibilityAssertions.displayed
import com.example.nestonespresso.MainActivity
import com.example.nestonespresso.R
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Before


@RunWith(AndroidJUnit4::class)
class `2_NestonComBananaLeite` {

    @Before
    fun setup() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun  quando_activity_abrir_edit_text_deve_ser_vazio() {
        displayed {
            allOf {
                id(R.id.edit_name)
                text("")
            }
        }
    }

    @Test
    fun  quando_activity_abrir_texto_importante_deve_existir() {
        displayed {
            allOf {
                id(R.id.text_sample)
                text("Texto super importante para a feature")
            }
        }
    }

    @Test
    fun  quando_activity_abrir_botao_deve_estar_desabilitado() {
        notEnabled {
            id(R.id.button_click_me)
        }
    }

    @Test
    fun  quando_digitar_MENOS_de_4_caracteres_botao_deve_permanener_desabilitado() {

        TextActions.typeText("ABC") {
            id(R.id.edit_name)
        }

        notEnabled {
            id(R.id.button_click_me)
        }
    }

    @Test
    fun  quando_digitar_MAIS_de_4_caracteres_botao_deve_ficar_habilitado() {
        Espresso.onView(
            ViewMatchers.withId(R.id.edit_name)
        ).perform(
            ViewActions.typeText("ABCD")
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.button_click_me)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.isEnabled()
            )
        )
    }
}
