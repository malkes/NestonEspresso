package com.example.nestonespresso.robot.other_way_1

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NestonOtherWay1Test {

    @Test
    fun  quando_activity_abrir_edit_text_deve_ser_vazio() {
        withMainActivity {
            mockQualquerCoisa()
            launchActivity()
        } verify {
            checkEmptyEditText()
        }
    }

    @Test
    fun  quando_activity_abrir_texto_importante_deve_existir() {
        withMainActivity {
            mockQualquerCoisa()
            launchActivity()
            verify {
                checkImportantText()
            }
        }
    }

    @Test
    fun  quando_activity_abrir_botao_deve_estar_desabilitado() {
        withMainActivity {
            mockQualquerCoisa()
            launchActivity()
            verify {
                checkButtonIsDisabled()
            }
        }
    }

    @Test
    fun  quando_digitar_MENOS_de_4_caracteres_botao_deve_permanener_desabilitado() {
        withMainActivity {
            launchActivity()
            typeInvalidText()
            verify {
                checkButtonIsDisabled()
            }
        }
    }

    @Test
    fun  quando_digitar_MAIS_de_4_caracteres_botao_deve_ficar_habilitado() {
        withMainActivity {
            launchActivity()
            typeValidText()
            verify {
                checkButtonIsEnable()
            }
        }
    }
}