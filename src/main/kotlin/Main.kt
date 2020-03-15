import com.google.gson.Gson
import java.io.File

fun main() {
    val fileName = "posts.json"
    File(fileName).writeText(Gson().toJson(createList()))
}

private fun createList() = listOf(
    Post(
        1,
        """
            Это исследовательская задача, направленная на приобретение навыков
        работы с документацией Android и анализа чужих приложений.
        Пока мы сами не умеем проигрывать видео, но, как вы наверное догадались,
        мы можем подключить другие приложения для его проигрывания.
        """.trimIndent(),
        "February 19th, 2020",
        "Stas Korolev",
        commentsCount = 5,
        sharesCount = 1,
        likesCount = 3,
        isLikedByUser = true
    ),
    Post(
        2,
        "Hi, there",
        "March 1st, 2020",
        "Mark Pink",
        commentsCount = 1,
        address = "Россия, Москва, улица Покровка, 29с1, подъезд 2",
        coordinates = Pair("55.760029", "37.648548"),
        postType = PostType.EVENT
    ),
    Post(
        3,
        """
            Добавьте в своё приложение возможность отображения списка постов, загруженных по сети с GitHub.
        """.trimIndent(),
        "March 3rd, 2020",
        "Steve Modern",
        sharesCount = 3,
        likesCount = 11,
        isLikedByUser = true,
        sourceVideo = "Qjf6kBmLilo",
        postType = PostType.YOUTUBE
    ),
    Post(
        4,
        dateOfPost = "March 4th, 2020",
        nameAuthor = "Stas Korolev",
        source = Post(
            10,
            "Welcome to China",
            "March 8th, 2020",
            "Jake Born"
        ),
        postType = PostType.REPOST
    ),
    Post(
        5,
        "My ad post",
        "March 9th, 2020",
        "Kate Puhanova",
        likesCount = 10,
        sourceAd = "https://weather.com/weather/today/l/55.79,37.36?par=google&temp=c",
        postType = PostType.AD_POST
    )
)