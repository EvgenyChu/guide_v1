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
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.template.R

@Composable
fun DrawerScreen(navController: NavController, onClick: () -> Unit) {

    val chapter = Chapters.values().toList()

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
        Row(
            modifier = Modifier
                .padding(top = 24.dp, start = 16.dp, bottom = 16.dp, end = 16.dp)
                .clickable { navController.navigate("StartScreen") }
        ) {
            Icon(
                Icons.Filled.List,
                tint = Color.White,
                contentDescription = "Назад"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Список разделов",
                style = MaterialTheme.typography.h4,
                color = Color.White
            )
        }

        chapter.forEach {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("ChapterScreen/${it.title}")
                    }
                    .padding(top = 24.dp, start = 16.dp, bottom = 16.dp, end = 16.dp)
            ) {
                Icon(
                    Icons.Filled.List,
                    tint = Color.White,
                    contentDescription = "Назад"
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = stringResource(id = it.title),
                    style = MaterialTheme.typography.h4,
                    color = Color.White
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick() }
                .padding(top = 24.dp, start = 16.dp, bottom = 16.dp, end = 16.dp)
        ) {
            Text(
                text = "Выйти",
                style = MaterialTheme.typography.h4,
                color = Color.White
            )
        }
        Spacer(Modifier.height(16.dp))
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