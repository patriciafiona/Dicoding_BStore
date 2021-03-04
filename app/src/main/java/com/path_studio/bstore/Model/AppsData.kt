package com.path_studio.bstore.Model

import android.util.Log

object AppsData {

    private val array_of_apps = arrayOf(
        arrayOf(
            1, // App ID
            "Adobe Lightroom - Photo Editor & Pro Camera", // App Name
            "Adobe", // Developer Name
            "Photography", // App Category
            4.3, // App Rating
            89.0, // App Size
            "https://play-lh.googleusercontent.com/CQk2YGH7nnXQa4nm3_ngHzx4lc04lR2i1a2tSL0WH0pSI98d5ylmATKbfSiO3ILGy88=s180-rw" // App Logo
        ),
        arrayOf(
            2,
            "Canva: Graphic Design, Video Collage, Logo Maker",
            "Canva",
            "Art & Design",
            4.6,
            26.0,
            "https://play-lh.googleusercontent.com/6dcTV8RNj9YTnyvQbEmDwKVZ6c9y0unKoJb7F4FC_qMgmKWYpb7f32VIsOj7vyo1GH4=s180-rw"
        ),
        arrayOf(
            3,
            "CapCut",
            "Bytedance Pte. Ltd.",
            "Video Players & Editors",
            4.5,
            47.0,
            "https://play-lh.googleusercontent.com/FhMbGI_yiAX7TFps4xwF1icQ4mj0BKqMqnNyV1JOSz1nY-S8GC0QynueW9zOIKKE3cud=s180-rw"
        ),
        arrayOf(
            4,
            "Disney+ Hotstar",
            "Novi Digital",
            "Entertainment",
            3.9,
            23.0,
            "https://play-lh.googleusercontent.com/Vd6XKGvZKp8r3Ikz4vRykNJaMjFULqftsqviOsMPepYTOu4ef-4HkUo3iEcPpOi4c2s=s180-rw"
        ),
        arrayOf(
            5,
            "JOOX: Gratis Musik download, Radio dan Karaoke",
            "Tencent Mobility Limited",
            "Music & Audio",
            4.4,
            70.0,
            "https://play-lh.googleusercontent.com/ERcaEpGkbIUMqLHESvFLkl6-g0Tz9g27HxY67ksipw2a5F4fa8YHewLm8xwkzs-FDw=s180-rw"
        ),
        arrayOf(
            6,
            "LINE: Free Calls & Messages",
            "LINE Corporation",
            "Communication",
            4.1,
            83.0,
            "https://play-lh.googleusercontent.com/74iMObG1vsR3Kfm82RjERFhf99QFMNIY211oMvN636_gULghbRBMjpVFTjOK36oxCbs=s180-rw"
        ),
        arrayOf(
            7,
            "Netflix",
            "Netflix, Inc.",
            "Entertainment",
            4.4,
            17.0,
            "https://play-lh.googleusercontent.com/TBRwjS_qfJCSj1m7zZB93FnpJM5fSpMA_wUlFDLxWAb45T9RmwBvQd5cWR5viJJOhkI=s180-rw"
        ),
        arrayOf(
            8,
            "PicsArt Photo Editor: Pic, Video & Collage Maker",
            "PicsArt",
            "Photography",
            4.2,
            37.0,
            "https://play-lh.googleusercontent.com/RmvBSjkThmix4S-hDIeIOknlmD67ZAah0Kfklo31ZsuMfRxni_B2oi2q01hWA_OsJw=s180-rw"
        ),
        arrayOf(
            9,
            "Pinterest - jutaan inspirasi dan ide kreatif",
            "Pinterest",
            "Lifestyle",
            4.6,
            20.0,
            "https://play-lh.googleusercontent.com/dVsv8Hc4TOUeLFAahxR8KANg22W9dj2jBsTW1VHv3CV-5NCZjP9D9i2j5IpfVx2NTB8=s180-rw"
        ),
        arrayOf(
            10,
            "Spotify",
            "Spotify Ltd.",
            "Music & Audio",
            4.5,
            27.0,
            "https://play-lh.googleusercontent.com/UrY7BAZ-XfXGpfkeWg0zCCeo-7ras4DCoRalC_WXXWTK9q5b0Iw7B0YQMsVxZaNB7DM=s180-rw"
        ),
        arrayOf(
            11,
            "TikTok",
            "TikTok Pte. Ltd.",
            "Video Players & Editors",
            4.5,
            35.0,
            "https://play-lh.googleusercontent.com/z5nin1RdQ4UZhv6fa1FNG7VE33imGqPgC4kKZIUjgf_up7E-Pj3AaojlMPwNNXaeGA=s180-rw"
        ),
        arrayOf(
            12,
            "Tinder - Match. Ngobrol. Bertemu.",
            "Tinder",
            "Lifestyle",
            3.3,
            46.0,
            "https://play-lh.googleusercontent.com/fDpoqIbZ884ylRnMK8Lx9Fu4DsLQk5yt4f9WkxeOAPpGnzc9BTi_YKkMsLvoMdx7Uzg=s180-rw"
        ),
        arrayOf(
            13,
            "Twitch: Livestream Multiplayer Games & Esports",
            "Twitch Interactive, Inc.",
            "Entertainment",
            4.4,
            37.0,
            "https://play-lh.googleusercontent.com/QLQzL-MXtxKEDlbhrQCDw-REiDsA9glUH4m16syfar_KVLRXlzOhN7tmAceiPerv4Jg=s180-rw"
        ),
        arrayOf(
            14,
            "Viu - Drama Korea & Asia Terbaru, Sub Indo",
            "Vuclip Mobile Video",
            "Entertainment",
            4.2,
            43.0,
            "https://play-lh.googleusercontent.com/-Bac1Iy76MPn8MQJCVrrIdJjo4cJJsvWJNGLoTGN6-fEfaVeKhzXYKN94umQvI7vdwE=s180-rw"
        ),
        arrayOf(
            15,
            "WhatsApp Messenger",
            "WhatsApp LLC",
            "Communication",
            4.2,
            27.0,
            "https://play-lh.googleusercontent.com/bYtqbOcTYOlgc6gqZ2rwb8lptHuwlNE75zYJu6Bn076-hTmvd96HH-6v7S0YUAAJXoJN=s180-rw"
        )
    )


    val listAllData: ArrayList<App>
        get() {
            val list = arrayListOf<App>()
            for (data in array_of_apps) {
                val app = App()
                app.appID = data[0] as Int
                app.appName = data[1].toString()
                app.devName = data[2].toString()
                app.appCategory = data[3].toString()
                app.ratting = data[4].toString().toDouble()
                app.appSize = data[5].toString().toDouble()
                app.appLogo = data[6].toString()
                list.add(app)
            }
            return list
        }

    val listData: ArrayList<App>
        get() {
            val list = arrayListOf<App>()
            for (data in array_of_apps) {
                val app = App()
                app.appName = data[1].toString()
                app.appSize = data[5].toString().toDouble()
                app.appLogo = data[6].toString()
                list.add(app)
            }
            return list
        }

    //get data from App ID
    fun listDataFromID(appID: Int): ArrayList<App>{
        val list = arrayListOf<App>()
        for (data in array_of_apps) {
            if(data[0].toString().equals(appID.toString())){
                val app = App()
                app.appID = data[0] as Int
                app.appName = data[1].toString()
                app.devName = data[2].toString()
                app.appCategory = data[3].toString()
                app.ratting = data[4].toString().toDouble()
                app.appSize = data[5].toString().toDouble()
                app.appLogo = data[6].toString()
                list.add(app)
            }
        }
        return list
    }

    //get 10 best app - based on ratting
    val listDataTenBestApp: ArrayList<App>
        get() {
            val list = arrayListOf<App>()
            //save data location index with ratting information
            val sortedAppRating = hashMapOf<Int,Double>()
            array_of_apps.forEachIndexed{ index, data -> sortedAppRating.put(index, data[4].toString().toDouble()) }

            //sorted data ratting (Best Ratting -> Worse Ratting)
            val temp = sortedAppRating.toList().sortedByDescending { (_, value) -> value}.toMap()
            //get all sorted index
            val arrayDataIndex = temp.keys.toList()

            for (i in 0..9) {
                val app = App()
                app.appName = array_of_apps[arrayDataIndex[i]][1].toString()
                app.appSize = array_of_apps[arrayDataIndex[i]][5].toString().toDouble()
                app.appLogo = array_of_apps[arrayDataIndex[i]][6].toString()
                list.add(app)
            }
            return list
        }

}