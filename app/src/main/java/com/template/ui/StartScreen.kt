package com.template.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.template.R

@Composable
fun StartScreen(navController: NavController) {
    val imageList: List<Pair<Int, Int>> = listOf(
        R.drawable.chapter_1 to R.string.chapter_1,
        R.drawable.chapter_2 to R.string.chapter_2,
        R.drawable.chapter_3 to R.string.chapter_3,
        R.drawable.chapter_4 to R.string.chapter_4,
        R.drawable.chapter_5 to R.string.chapter_5,
        R.drawable.chapter_6 to R.string.chapter_6,
        R.drawable.chapter_7 to R.string.chapter_7,
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .background(color = MaterialTheme.colors.background),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            imageList.forEach {
                Card(
                    modifier = Modifier
                        .size(250.dp)
                        .clickable {
                            navController.navigate("ChapterScreen/${it.second}")
                        },
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = it.first),
                            contentScale = ContentScale.Crop,
                            contentDescription = null
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(color = Color(0xFF212121).copy(alpha = 0.5f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = stringResource(id = it.second),
                                style = MaterialTheme.typography.h4,
                                color = Color.White,
                            )
                        }
                        Text(
                            text = stringResource(id = it.second),
                            style = MaterialTheme.typography.h4,
                            color = Color.White,
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

enum class Chapters(val title: Int, val items: List<Pair<Int, Int>>) {
    CHAPTER1(
        title = R.string.chapter_1,
        items = listOf(
            R.string.item_1_1 to R.drawable.item_1_1,
            R.string.item_1_2 to R.drawable.item_1_2,
            R.string.item_1_3 to R.drawable.item_1_3
        )
    ),
    CHAPTER2(
        title = R.string.chapter_2,
        items = listOf(
            R.string.item_2_1 to R.drawable.item_2_1,
            R.string.item_2_2 to R.drawable.item_2_2,
            R.string.item_2_3 to R.drawable.item_2_3
        )
    ),
    CHAPTER3(
        title = R.string.chapter_3,
        items = listOf(
            R.string.item_3_1 to R.drawable.item_3_1,
            R.string.item_3_2 to R.drawable.item_3_2,
            R.string.item_3_3 to R.drawable.item_3_3
        )
    ),
    CHAPTER4(
        title = R.string.chapter_4,
        items = listOf(
            R.string.item_4_1 to R.drawable.item_4_1,
            R.string.item_4_2 to R.drawable.item_4_2,
            R.string.item_4_3 to R.drawable.item_4_3
        )
    ),
    CHAPTER5(
        title = R.string.chapter_5,
        items = listOf(
            R.string.item_5_1 to R.drawable.item_5_1,
            R.string.item_5_2 to R.drawable.item_5_2,
            R.string.item_5_3 to R.drawable.item_5_3
        )
    ),
    CHAPTER6(
        title = R.string.chapter_6,
        items = listOf(
            R.string.item_6_1 to R.drawable.item_6_1,
            R.string.item_6_2 to R.drawable.item_6_2,
            R.string.item_6_3 to R.drawable.item_6_3
        )
    ),
    CHAPTER7(
        title = R.string.chapter_7,
        items = listOf(
            R.string.item_7_1 to R.drawable.item_7_1,
            R.string.item_7_2 to R.drawable.item_7_2,
            R.string.item_7_3 to R.drawable.item_7_3
        )
    )
}

enum class Items(val title: Int, val content: Pair<Int, Int>) {
    ITEM1(
        title = R.string.item_1_1,
        content = R.string.content_item_1_1 to R.drawable.item_1_1
    ),
    ITEM2(
        title = R.string.item_1_2,
        content = R.string.content_item_1_2 to R.drawable.item_1_2
    ),
    ITEM3(
        title = R.string.item_1_3,
        content = R.string.content_item_1_3 to R.drawable.item_1_3
    ),
    ITEM4(
        title = R.string.item_2_1,
        content = R.string.content_item_2_1 to R.drawable.item_2_1
    ),
    ITEM5(
        title = R.string.item_2_2,
        content = R.string.content_item_2_2 to R.drawable.item_2_2
    ),
    ITEM6(
        title = R.string.item_2_3,
        content = R.string.content_item_2_3 to R.drawable.item_2_3
    ),
    ITEM7(
        title = R.string.item_3_1,
        content = R.string.content_item_3_1 to R.drawable.item_3_1
    ),
    ITEM8(
        title = R.string.item_3_2,
        content = R.string.content_item_3_2 to R.drawable.item_3_2
    ),
    ITEM9(
        title = R.string.item_3_3,
        content = R.string.content_item_3_3 to R.drawable.item_3_3
    ),
    ITEM10(
        title = R.string.item_4_1,
        content = R.string.content_item_4_1 to R.drawable.item_4_1
    ),
    ITEM11(
        title = R.string.item_4_2,
        content = R.string.content_item_4_2 to R.drawable.item_4_2
    ),
    ITEM12(
        title = R.string.item_4_3,
        content = R.string.content_item_4_3 to R.drawable.item_4_3
    ),
    ITEM13(
        title = R.string.item_5_1,
        content = R.string.content_item_5_1 to R.drawable.item_5_1
    ),
    ITEM14(
        title = R.string.item_5_2,
        content = R.string.content_item_5_2 to R.drawable.item_5_2
    ),
    ITEM15(
        title = R.string.item_5_3,
        content = R.string.content_item_5_3 to R.drawable.item_5_3
    ),
    ITEM16(
        title = R.string.item_6_1,
        content = R.string.content_item_6_1 to R.drawable.item_6_1
    ),
    ITEM17(
        title = R.string.item_6_2,
        content = R.string.content_item_6_2 to R.drawable.item_6_2
    ),
    ITEM18(
        title = R.string.item_6_3,
        content = R.string.content_item_6_3 to R.drawable.item_6_3
    ),
    ITEM19(
        title = R.string.item_7_1,
        content = R.string.content_item_7_1 to R.drawable.item_7_1
    ),
    ITEM20(
        title = R.string.item_7_2,
        content = R.string.content_item_7_2 to R.drawable.item_7_2
    ),
    ITEM21(
        title = R.string.item_7_3,
        content = R.string.content_item_7_3 to R.drawable.item_7_3
    )
}