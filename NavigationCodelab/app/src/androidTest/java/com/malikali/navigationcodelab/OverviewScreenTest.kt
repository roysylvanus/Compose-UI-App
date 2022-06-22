package com.malikali.navigationcodelab

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.malikali.navigationcodelab.ui.overview.OverviewBody
import org.junit.Rule
import org.junit.Test

class OverviewScreenTest {


    @get:Rule
    val composeTestRule = createComposeRule()

    private fun mockSuccessfulContentPreview(){
        composeTestRule.setContent {
            OverviewBody()
        }
    }

    @Test
    fun overview_AlertsDisplayed(){
        mockSuccessfulContentPreview()

        composeTestRule.onNodeWithText("Alerts")
            .assertIsDisplayed()
    }
}