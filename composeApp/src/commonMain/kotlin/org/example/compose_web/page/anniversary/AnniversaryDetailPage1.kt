package org.example.compose_web.page.anniversary

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import composeweb.composeapp.generated.resources.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource


@Composable
fun AnniversaryDetailPage1(
    pagerState: PagerState,
    scope: CoroutineScope,
) {
    val font = FontFamily(Font(Res.font.NanumMyeongjo))

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .paint(
                    painterResource(Res.drawable.background_1),
                    contentScale = androidx.compose.ui.layout.ContentScale.Crop
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(Res.drawable.visual_logo), // 이미지 리소스 준비 필요
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(64.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
            ) {
                Text(
                    text = "이해찬",
                    fontSize = 38.sp,
                    fontFamily = font,
                    color = Color.White
                )
                Text(
                    text = "&",
                    fontSize = 24.sp,
                    fontFamily = font,
                    color = Color.White
                )
                Text(
                    text = "이지수",
                    fontSize = 38.sp,
                    fontFamily = font,
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }

            Text(
                text = "1st Anniversary",
                fontSize = 16.sp,
                fontFamily = font,
                color = Color.White,
                modifier = Modifier.padding(top = 16.dp),
            )

            Spacer(modifier = Modifier.height(36.dp))
        }

        Button(
            onClick = {
                scope.launch {
                    pagerState.animateScrollToPage(pagerState.currentPage + 1) // 첫 번째 페이지로 돌아가기
                }
            },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
            elevation = ButtonDefaults.elevation(0.dp),
            modifier = Modifier.align(Alignment.BottomCenter)
                .padding(24.dp)
                .height(48.dp)
        ) {
            Icon(
                painter = painterResource(Res.drawable.arrow_forward_24),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(48.dp).rotate(90f)
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(150.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.White, Color.Transparent),
                        startY = 700f,
                        endY = 0f
                    )
                )
        )
    }
}
