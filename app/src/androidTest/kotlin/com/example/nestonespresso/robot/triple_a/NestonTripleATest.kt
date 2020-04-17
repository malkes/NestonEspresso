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
}