package com.example.nestonespresso.robot.triple_a

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NestonTripleATest {

    @Test
    fun  quando_activity_abrir_edit_text_deve_ser_vazio() {
        withMainActivity {
            arrange {
                mockQualquerCoisa()
            }
            act {
                launch()
            }
            assert {
                checkEmptyEditText()
            }
        }
    }

    @Test
    fun  quando_activity_abrir_texto_importante_deve_existir() {
        withMainActivity {
            arrange {
                mockQualquerCoisa()
            }
            act {
                launch()
            }
            assert {
                checkImportantText()
            }
        }
    }

    @Test
    fun  quando_activity_abrir_botao_deve_estar_desabilitado() {
        withMainActivity {
            arrange {
                mockQualquerCoisa()
            }
            act {
                launch()
            }
            assert {
                checkButtonIsDisabled()
            }
        }
    }

    @Test
    fun  quando_digitar_MENOS_de_4_caracteres_botao_deve_permanener_desabilitado() {
        withMainActivity {
            act {
                launch()
                typeInvalidText()
            }
            assert {
                checkButtonIsDisabled()
            }
        }
    }

    @Test
    fun  quando_digitar_MAIS_de_4_caracteres_botao_deve_ficar_habilitado() {
        withMainActivity {
            act {
                launch()
                typeValidText()
            }
            assert {
                checkButtonIsEnable()
            }
        }
    }
}