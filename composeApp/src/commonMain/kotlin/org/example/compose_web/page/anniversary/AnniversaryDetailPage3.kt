package org.example.compose_web.page.anniversary

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import composeweb.composeapp.generated.resources.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import kotlin.math.absoluteValue


@Composable
fun AnniversaryDetailPage3(
    pagerState: PagerState,
    scope: CoroutineScope,
) {
    val font = FontFamily(Font(Res.font.NanumMyeongjo))

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Spacer(modifier = Modifier.height(64.dp))
            Spacer(
                modifier = Modifier
                    .size(300.dp, 1.dp)
                    .background(Color.Black)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "해찬 & 지수의\n1주년을 맞이하며",
                fontSize = 24.sp,
                fontFamily = font,
                color = Color.Black,
                modifier = Modifier.padding(top = 16.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "봄\n여름\n가을\n겨울\n\n모든 계절을 겪었고,\n우리는 행복했고,\n앞으로도 행복하길",
                fontSize = 16.sp,
                fontFamily = font,
                color = Color.Black,
                modifier = Modifier.padding(top = 16.dp),
                textAlign = TextAlign.Center,
            )
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
