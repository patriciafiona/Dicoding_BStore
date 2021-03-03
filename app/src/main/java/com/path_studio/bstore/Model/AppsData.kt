package com.path_studio.bstore.Model

object AppsData {
    private val array_appName = arrayOf(
        "Adobe Lightroom - Photo Editor & Pro Camera",
        "Canva: Graphic Design, Video Collage, Logo Maker",
        "CapCut",
        "Disney+",
        "JOOX: Gratis Musik download, Radio dan Karaoke",
        "LINE: Free Calls & Messages",
        "Netflix",
        "PicsArt Photo Editor: Pic, Video & Collage Maker",
        "Pinterest - jutaan inspirasi dan ide kreatif",
        "Spotify",
        "TikTok",
        "Tinder - Match. Ngobrol. Bertemu.",
        "Twitch: Livestream Multiplayer Games & Esports",
        "Viu - Drama Korea & Asia Terbaru, Sub Indo",
        "WhatsApp Messenger",
    )

    private val array_devName = arrayOf(
        "Adobe",
        "Canva",
        "Bytedance Pte. Ltd.",
        "Disney",
        "Tencent Mobility Limited",
        "LINE Corporation",
        "Netflix, Inc.",
        "PicsArt",
        "Pinterest",
        "Spotify Ltd.",
        "TikTok Pte. Ltd.",
        "Tinder",
        "Twitch Interactive, Inc.",
        "Vuclip Mobile Video",
        "WhatsApp LLC"
    )

    private val array_appLogo = arrayOf(
        "https://play-lh.googleusercontent.com/CQk2YGH7nnXQa4nm3_ngHzx4lc04lR2i1a2tSL0WH0pSI98d5ylmATKbfSiO3ILGy88=s180-rw",
        "https://play-lh.googleusercontent.com/6dcTV8RNj9YTnyvQbEmDwKVZ6c9y0unKoJb7F4FC_qMgmKWYpb7f32VIsOj7vyo1GH4=s180-rw",
        "https://play-lh.googleusercontent.com/FhMbGI_yiAX7TFps4xwF1icQ4mj0BKqMqnNyV1JOSz1nY-S8GC0QynueW9zOIKKE3cud=s180-rw",
        "https://play-lh.googleusercontent.com/xoGGYH2LgLibLDBoxMg-ZE16b-RNfITw_OgXBWRAPin2FZY4FGB9QKBYApR-0rSCkQ=s180-rw",
        "https://play-lh.googleusercontent.com/ERcaEpGkbIUMqLHESvFLkl6-g0Tz9g27HxY67ksipw2a5F4fa8YHewLm8xwkzs-FDw=s180-rw",
        "https://play-lh.googleusercontent.com/74iMObG1vsR3Kfm82RjERFhf99QFMNIY211oMvN636_gULghbRBMjpVFTjOK36oxCbs=s180-rw",
        "https://play-lh.googleusercontent.com/TBRwjS_qfJCSj1m7zZB93FnpJM5fSpMA_wUlFDLxWAb45T9RmwBvQd5cWR5viJJOhkI=s180-rw",
        "https://play-lh.googleusercontent.com/RmvBSjkThmix4S-hDIeIOknlmD67ZAah0Kfklo31ZsuMfRxni_B2oi2q01hWA_OsJw=s180-rw",
        "https://play-lh.googleusercontent.com/dVsv8Hc4TOUeLFAahxR8KANg22W9dj2jBsTW1VHv3CV-5NCZjP9D9i2j5IpfVx2NTB8=s180-rw",
        "https://play-lh.googleusercontent.com/UrY7BAZ-XfXGpfkeWg0zCCeo-7ras4DCoRalC_WXXWTK9q5b0Iw7B0YQMsVxZaNB7DM=s180-rw",
        "https://play-lh.googleusercontent.com/z5nin1RdQ4UZhv6fa1FNG7VE33imGqPgC4kKZIUjgf_up7E-Pj3AaojlMPwNNXaeGA=s180-rw",
        "https://play-lh.googleusercontent.com/fDpoqIbZ884ylRnMK8Lx9Fu4DsLQk5yt4f9WkxeOAPpGnzc9BTi_YKkMsLvoMdx7Uzg=s180-rw",
        "https://play-lh.googleusercontent.com/QLQzL-MXtxKEDlbhrQCDw-REiDsA9glUH4m16syfar_KVLRXlzOhN7tmAceiPerv4Jg=s180-rw",
        "https://play-lh.googleusercontent.com/-Bac1Iy76MPn8MQJCVrrIdJjo4cJJsvWJNGLoTGN6-fEfaVeKhzXYKN94umQvI7vdwE=s180-rw",
        "https://play-lh.googleusercontent.com/bYtqbOcTYOlgc6gqZ2rwb8lptHuwlNE75zYJu6Bn076-hTmvd96HH-6v7S0YUAAJXoJN=s180-rw"
    )

    val listData: ArrayList<App>
        get() {
            val list = arrayListOf<App>()
            for (position in array_appName.indices) {
                val app = App()
                app.appName = array_appName[position]
                app.appLogo = array_appLogo[position]
                app.devName = array_devName[position]
                list.add(app)
            }
            return list
        }
}