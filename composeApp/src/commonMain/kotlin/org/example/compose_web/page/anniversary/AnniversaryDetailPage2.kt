package org.example.compose_web.page.anniversary

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import composeweb.composeapp.generated.resources.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.example.compose_web.page.anniversary.components.CardComponent
import org.example.compose_web.page.anniversary.components.pageImages
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource


@Composable
fun AnniversaryDetailPage2(
    pagerState: PagerState,
    scope: CoroutineScope,
) {
    val font = FontFamily(Font(Res.font.NanumMyeongjo))
    val imagePagerState = rememberPagerState(pageCount = { pageImages.size })

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 64.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Spacer(
                modifier = Modifier
                    .size(300.dp, 1.dp)
                    .background(Color.Black)
            )

            Text(
                text = "Gallery",
                fontSize = 24.sp,
                fontFamily = font,
                color = Color.Black,
                modifier = Modifier.padding(top = 16.dp),
            )
        }
        Column(
            modifier = Modifier.align(Alignment.Center)
                .fillMaxWidth()
                .fillMaxHeight(0.65f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
        ) {
            HorizontalPager(
                state = imagePagerState,
                contentPadding = PaddingValues(horizontal = 32.dp),
                modifier = Modifier.fillMaxWidth()
            ) { page ->
                CardComponent(
                    imagePagerState = imagePagerState,
                    page = page,
                    pageImage = pageImages[page]
                )
            }
            Row(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(imagePagerState.pageCount) { iteration ->
                    val color = if (imagePagerState.currentPage == iteration) Color.DarkGray else Color.LightGray
                    Box(
                        modifier = Modifier
                            .padding(2.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(8.dp)
                    )
                }
            }
        }

        Button(
            onClick = {
                scope.launch {
                    pagerState.animateScrollToPage(pagerState.currentPage + 1)
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
                tint = Color.Black.copy(alpha = 0.9f),
                modifier = Modifier.size(48.dp).rotate(90f)
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 24.dp)
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
