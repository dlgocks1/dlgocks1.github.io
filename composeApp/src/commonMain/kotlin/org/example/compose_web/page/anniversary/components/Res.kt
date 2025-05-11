package org.example.compose_web.page.anniversary.components

import composeweb.composeapp.generated.resources.*
import composeweb.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.DrawableResource

data class PageImage(
    val drawableResource: DrawableResource,
    val description: String,
    val date: String,
)

val pageImages = listOf(
    PageImage(
        drawableResource = Res.drawable._24_05_09_11zon,
        description = "석촌호수에서",
        date = "24.05.09",
    ),
    PageImage(
        drawableResource = Res.drawable._24_05_11_11zon,
        description = "비가오던 올림픽공원",
        date = "24.05.11",
    ),
    PageImage(
        drawableResource = Res.drawable._24_06_06_11zon,
        description = "강릉에서",
        date = "24.06.06",
    ),
    PageImage(
        drawableResource = Res.drawable._24_06_21_11zon,
        description = "남산타워에서",
        date = "24.06.21",
    ),
    PageImage(
        drawableResource = Res.drawable._24_08_10_11zon,
        description = "코엑스 아쿠아리움에서",
        date = "24.08.10",
    ),
    PageImage(
        drawableResource = Res.drawable._24_08_18_11zon,
        description = "흠뻑쇼에서",
        date = "24.08.18",
    ),
    PageImage(
        drawableResource = Res.drawable._24_10_04_11zon,
        description = "전주에서",
        date = "24.10.04",
    ),
    PageImage(
        drawableResource = Res.drawable._24_11_01_11zon,
        description = "가평 캠핑장에서",
        date = "24.11.01",
    ),
    PageImage(
        drawableResource = Res.drawable._24_11_28_11zon,
        description = "겨울의 초입에서",
        date = "24.11.28",
    ),
    PageImage(
        drawableResource = Res.drawable._24_12_25_11zon,
        description = "강릉의 크리스마스",
        date = "25.12.25",
    ),
    PageImage(
        drawableResource = Res.drawable._25_03_02_11zon,
        description = "도넛 만들기",
        date = "25.03.02",
    ),
    PageImage(
        drawableResource = Res.drawable._25_03_15_11zon,
        description = "서울숲 피크닉",
        date = "25.03.15",
    ),
    PageImage(
        drawableResource = Res.drawable._25_04_19_11zon,
        description = "날씨가 좋던 경주에서",
        date = "25.04.19",
    ),
    PageImage(
        drawableResource = Res.drawable._25_05_09_11zon,
        description = "두번 째 5월 9일",
        date = "25.05.09",
    ),
)