@file:OptIn(ExperimentalMaterial3Api::class)

package com.hussein.jetpackcomposematerial3.ui.theme.compose

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.maxkeppeker.sheets.core.models.base.rememberSheetState
import com.maxkeppeler.sheets.calendar.CalendarDialog
import com.maxkeppeler.sheets.calendar.models.CalendarConfig
import com.maxkeppeler.sheets.calendar.models.CalendarSelection
import com.maxkeppeler.sheets.calendar.models.CalendarStyle
import com.maxkeppeler.sheets.clock.ClockDialog
import com.maxkeppeler.sheets.clock.models.ClockConfig
import com.maxkeppeler.sheets.clock.models.ClockSelection
import java.time.LocalDate

@Composable
fun DateTimeDialog(){
    val calendarState = rememberSheetState()

    CalendarDialog (state = calendarState,
        config = CalendarConfig(monthSelection = true, yearSelection = true,
            style = CalendarStyle.WEEK, disabledDates = listOf(LocalDate.now().plusDays(7))
        ),
        selection = CalendarSelection.Date {date->
        Log.d("Data","$date")
    })

    val clockState = rememberSheetState()
    
    ClockDialog(state = clockState, config = ClockConfig(is24HourFormat = false), selection = ClockSelection.HoursMinutes{
        hours, minutes ->
        Log.d("Data","$hours:$minutes")
    })
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            calendarState.show()
        }) {
            Text(text = "Date Picker")
        }

        Button(onClick = {
            clockState.show()
        }) {
            Text(text = "Time Picker")
        }
    }
}