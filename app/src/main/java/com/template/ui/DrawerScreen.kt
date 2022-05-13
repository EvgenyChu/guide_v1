package com.template.ui

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.template.R

@Composable
fun DrawerScreen(navController: NavController, onClick: () -> Unit) {
    val listChapter = listOf(
        R.drawable.image_1 to stringResource(id = R.string.chapter_1),
        R.drawable.image_2 to stringResource(id = R.string.chapter_2),
        R.drawable.image_3 to stringResource(id = R.string.chapter_3),
        R.drawable.image_4 to stringResource(id = R.string.chapter_4),
        R.drawable.image_5 to stringResource(id = R.string.chapter_5),
        R.drawable.image_6 to stringResource(id = R.string.chapter_6),
        R.drawable.image_7 to stringResource(id = R.string.chapter_7),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.primary)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier
                .padding(top = 24.dp, start = 16.dp, bottom = 16.dp)
        ) {
            Icon(
                Icons.Filled.Home,
                tint = MaterialTheme.colors.onSecondary,
                contentDescription = "Назад"
            )
            Text(
                text = "guide_v1",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(start = 16.dp),
                color = MaterialTheme.colors.onSecondary
            )
        }
        listChapter.forEach {
            Row(
                modifier = Modifier
                    .clickable { }
                    .padding(top = 24.dp, start = 16.dp, bottom = 16.dp, end = 16.dp)
            ) {
                Text(text = it.second)
            }
        }
        Row(
            modifier = Modifier
                .padding(top = 24.dp, start = 16.dp, bottom = 16.dp, end = 16.dp)
                .clickable { onClick() }
        ) {
            Text(text = "Выйти")
        }
    }
}

@Composable
fun ToolBar(
    onMenuClick: () -> Unit
) {
    TopAppBar(backgroundColor = MaterialTheme.colors.primary) {
        IconButton(onClick = { onMenuClick() }) {
            Icon(
                Icons.Filled.Home,
                tint = MaterialTheme.colors.onSecondary,
                contentDescription = "Назад"
            )
        }
        Text(
            text = "guide_v1",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(start = 16.dp),
            color = MaterialTheme.colors.onSecondary
        )
    }
}