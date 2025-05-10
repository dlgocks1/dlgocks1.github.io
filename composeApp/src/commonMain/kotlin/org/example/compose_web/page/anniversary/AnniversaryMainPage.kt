package org.example.compose_web.page.anniversary

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier


@Composable
fun AnniversaryMainPage() {
    val pagerState = rememberPagerState(pageCount = { 4 })
    val scope = rememberCoroutineScope()

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        VerticalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState,
        ) { page ->
            when (page) {
                0 -> AnniversaryDetailPage1(pagerState, scope)
                1 -> AnniversaryDetailPage3(pagerState, scope)
                2 -> AnniversaryDetailPage2(pagerState, scope)
                else -> AnniversaryDetailPage4(pagerState, scope)
            }
        }
    }
}
