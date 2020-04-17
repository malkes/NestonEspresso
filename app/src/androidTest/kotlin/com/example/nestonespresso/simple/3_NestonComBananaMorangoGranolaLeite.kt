package com.example.nestonespresso.simple

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.nestonespresso.MainActivity
import com.example.nestonespresso.R
import com.example.test.extension.hasText
import com.example.test.extension.isDisable
import com.example.test.extension.isEnabled
import com.example.test.extension.typeText
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class `4_NestonComBananaMorangoGranolaLeite` {

    @Before
    fun setup() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun  quando_activity_abrir_edit_text_deve_ser_vazio() {
        R.id.edit_name.hasText("")
    }

    @Test
    fun  quando_activity_abrir_texto_importante_deve_existir() {
        R.id.text_sample.hasText("Texto super importante para a feature")
    }

    @Test
    fun  quando_activity_abrir_botao_deve_estar_desabilitado() {
        R.id.button_click_me.isDisable()
    }

    @Test
    fun  quando_digitar_MENOS_de_4_caracteres_botao_deve_permanener_desabilitado() {
        R.id.edit_name.typeText("ABC")
        R.id.button_click_me.isDisable()
    }

    @Test
    fun  quando_digitar_MAIS_de_4_caracteres_botao_deve_ficar_habilitado() {
        R.id.edit_name.typeText("ABCD")
        R.id.button_click_me.isEnabled()
    }
}
