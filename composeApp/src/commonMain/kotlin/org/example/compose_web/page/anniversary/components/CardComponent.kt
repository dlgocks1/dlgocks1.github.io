package org.example.compose_web.page.anniversary.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import composeweb.composeapp.generated.resources.NanumMyeongjo
import composeweb.composeapp.generated.resources.Res
import composeweb.composeapp.generated.resources.background_1
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import kotlin.math.absoluteValue

@Composable
fun CardComponent(
    imagePagerState: PagerState,
    page: Int,
    pageImage: PageImage,
) {
    val font = FontFamily(Font(Res.font.NanumMyeongjo))

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "${pageImage.date}\n${pageImage.description}",
            fontSize = 16.sp,
            fontFamily = font,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(16.dp)
        )
        Card(
            Modifier
                .fillMaxSize()
                .graphicsLayer {
                    val pageOffset = imagePagerState.currentPage - page + imagePagerState.currentPageOffsetFraction
                    alpha = lerp(
                        start = 0.5f,
                        stop = 1f,
                        fraction = 1f - pageOffset.absoluteValue.coerceIn(0f, 1f),
                    )
                    lerp(
                        start = 1f,
                        stop = 0.8f,
                        fraction = pageOffset.absoluteValue.coerceIn(0f, 1f),
                    ).let {
                        scaleX = it
                        scaleY = it
                        val sign = if (pageOffset > 0) 1 else -1
                        translationX = sign * size.width * (1 - it) / 2
                    }
                }
                .padding(horizontal = 8.dp)
        ) {
            Image(
                painter = painterResource(pageImage.drawableResource),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
    }
}