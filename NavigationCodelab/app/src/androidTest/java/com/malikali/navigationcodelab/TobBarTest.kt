package com.malikali.navigationcodelab

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.malikali.navigationcodelab.ui.components.RallyTabRow
import com.malikali.navigationcodelab.ui.theme.RallyTheme
import org.junit.Rule
import org.junit.Test

class TobBarTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun rallyTopAppBarTest(){

        mockSuccessfulAccountsTopBar()

        composeTestRule.onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertIsSelected()

    }

    @Test
    fun rallyTopAppBarTest_currentLabelExists(){

        mockSuccessfulAccountsTopBar()
        composeTestRule.onRoot(useUnmergedTree = true).printToLog("currentLabelExists")


        composeTestRule
            .onNode(hasText(RallyScreen.Accounts.name.uppercase()) and
                    hasParent(hasContentDescription(RallyScreen.Accounts.name)),useUnmergedTree = true)
            .assertExists()
    }

    private fun mockSuccessfulAccountsTopBar(){
        val allScreens = RallyScreen.values().toList()

        composeTestRule.setContent {
            RallyTheme {
                RallyTabRow(
                    allScreens = allScreens,
                    onTabSelected = {},
                    currentScreen = RallyScreen.Accounts
                )
            }
        }
    }
}