package com.path_studio.bstore.Model

object AppsData {

    /*
    App Category ID:
    - Art & Design: 1
    - Communication: 2
    - Entertainment: 3
    - Game: 4
    - Lifestyle: 5
    - Music & Audio: 6
    - Photography: 7
    - Video Players & Editors: 8

    How to read App ID:
    exp: 70003
    photography apps index 3
     */

    private val array_of_apps = arrayOf(
            arrayOf(
                    70001, // App ID
                    "Adobe Lightroom - Photo Editor & Pro Camera", // App Name
                    "Adobe", // Developer Name
                    "Photography", // App Category
                    4.3, // App Rating
                    89.0, // App Size
                    "https://play-lh.googleusercontent.com/CQk2YGH7nnXQa4nm3_ngHzx4lc04lR2i1a2tSL0WH0pSI98d5ylmATKbfSiO3ILGy88=s180-rw", // App Logo
                    "https://dota2.co.id/wp-content/uploads/2020/08/adobe-lightroom-apk-latest-version.png", //Background Animated Img
                    arrayOf(
                        "https://play-lh.googleusercontent.com/ukgi04WyJpIG0KngTyuVwwutHTSvf_823BphXxI5AjkVCzkHp6u3bFtXA6eV5ncgjg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/oujtlbUBmhh2w7qAgn6Lwe0GK7kPFMXhODFYnXoPikyUCbL8LwgBdfVShdxIxMFiFTM=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/ezTz1twdwbxIZiBFEdkmL0J9HCSFDAtt82Am4k83Lpy7whFzECWW-y1XWDEbn-tZzGs4=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/auOMdIDy5QouDpiBl08OuvO2mXHJSdZreaIDEE684lsgjeZ2bhlLpJsTkJeEjyt8Bg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/nWUhhVEsgJtq6XjDFNivXt6gXgGfNjBxfimFnw_h_P6WmBVGDq-p0NZVXz-uzgAdqI8=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/M6QxGXNf-5oSyhAlEaQ0NRA7nb2ZTmHd9Oi8b0MHzvn-OQrjNCQcivTo8Fa2q8ohgQ=w720-h310-rw"
                    ),
                    "P", // Banner Type (Portrait or Landscape)

            ),
            arrayOf(
                    10001,
                    "Canva: Graphic Design, Video Collage, Logo Maker",
                    "Canva",
                    "Art & Design",
                    4.6,
                    26.0,
                    "https://play-lh.googleusercontent.com/6dcTV8RNj9YTnyvQbEmDwKVZ6c9y0unKoJb7F4FC_qMgmKWYpb7f32VIsOj7vyo1GH4=s180-rw",
                    "https://static-cse.canva.com/_next/static/assets/desktop-banner-bg.3394x1697.3e134ba4d3a9012b6ec8b89ea4f913e6.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/kRIhICbBs3lE0AQpN2Xh0H1g52OB_tEPF_U-IME6ksn_aJJinHwJzhV8WK3B3zXlpw=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/P4mdthdc1S7lKKFskHFU5B0JXy_nqi3vgYAHq1Mn-Cc0jLWnDjPhlXD2OlkC-NOAyJey=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/DdkJc-hDwgb26ojIiEhRIWqSmXJWi6bHuUcC3xxlI-XFRk3zK8_kp1eXhKHzksmkrg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/L9ShOvWkfcAbg3XWuK3cgUvYnKDv4OvZ1yWH6SVl1e3NpAT5Xd_7KiOYktTSYaX3ly8=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/pwDtnh71wTN7ljw_tvBhWdiq0H76FEjV7THrhJvrWzLrPn5UvnZ1drnZedTy7SXYsQ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/mQieOeLAGfubH5yNIirPIAHlTEgAf1Rfp85eqHGRDlXkYIKk1ZdROPYdMwD3MrXoSsk=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/Hk75MtbDwWQtuUix84WPlLEcYYg4wdjJCY66gvmtSWxo49HNIEW_1YgCEMFSUY5e_AI7=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/-6s2fXrlRL3krxvrNlRcT2rp6ONl4jOz3aeXsXK03_8n_ppVnJvmn-2eCGQ8anynXw=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    80001,
                    "CapCut",
                    "Bytedance Pte. Ltd.",
                    "Video Players & Editors",
                    4.5,
                    47.0,
                    "https://play-lh.googleusercontent.com/FhMbGI_yiAX7TFps4xwF1icQ4mj0BKqMqnNyV1JOSz1nY-S8GC0QynueW9zOIKKE3cud=s180-rw",
                    "https://berita.teknologi.id/uploads/article/1607414850_gadgetmatch-20200814-oppo-reno4-08.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/_3Td9_BNZE2N_raHGYYV4qEpBMUHAEWtv4n7qNekeHE7m6sXmhlXIrbnW5B8z0bZMg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/rnigP1_zqfB0GIgIs2QLSGdgIHLWOyHJxISpJOSwGHNiHdQNeRC8AKR_S9NHAc_iiU0=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/0oTZ0mjkRjYjkwaHTP3gweiQKuscTQrN6ZHc-xd3EOkyyN3BvflqlUsyTUiaRPdW-Q=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/LlhoEKjfuhQ3gagSwK7Pv1UUW8a8FjxWC3YoepU2SLbgG47BvZqJpLlopNsDjknKgr4=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/yOkcyRQBD8LEBPh6iCRXFkBCTkkKwgLvxyNXYfmAEv5rHbd8wK_s7kfNxC6uJLix9Q=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/uwJvsJ12fbSPCywzzd8QMf4E_hPZK-s8qzFaYXMwQXBctcYkbEpTrzWRIZMXxjVZHXg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/hkzH8hwAyIqPjayNgU7JE1OWI6DKRWQX2HQCJ2KXr5yM2uKBxXlgyJO34FoU34mMzQ=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    30001,
                    "Disney+ Hotstar",
                    "Novi Digital",
                    "Entertainment",
                    3.9,
                    23.0,
                    "https://play-lh.googleusercontent.com/Vd6XKGvZKp8r3Ikz4vRykNJaMjFULqftsqviOsMPepYTOu4ef-4HkUo3iEcPpOi4c2s=s180-rw",
                    "https://asset.kompas.com/crops/Ikw-ABa5pm9-7ATNBiKoPqzezAw=/124x0:812x459/750x500/data/photo/2020/08/23/5f41ce7c1f5b9.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/Bdbk4kB46xnLxQSg6nm-XrNMejTw6hpRxdRiHiCsGF06E4BtdJBy-5oGlULuQeWL_Hw=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/Gfu70-LZUt4AXfUYByqAWpROo3lsGnOhdGK4YfvBf31Oj2WgH4mcYSYtF_AasmWATBCc=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/UPbV5h2XtW3WISRy79meWhdQbTBGBvkSkd4OW8SKzpBESZrlciK6JokTGFVVCz6UryU=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/ejUh9aCB94Jy4sR_5m0BeMJTq3QbeZWROhPD9wke2WDgnhFMFGacDr6rvAuGBPaGO98J=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/fnHebd34rzt3pngk8RLRq2DW04IVYXDkPSMq3467V6V9jNZpNDqzs8KdOqc_oOVq2A=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/NH22PkZetGgZ-1cfHwINysyUKytZ6kzGeSsTmkSztlypf5yztDI5QOAmb2o-ehncJNM=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/-uHIMuOHP9iCgI14ndctpEiQnFTNDtU3KCpN1yPrMYDnHIHzzJKimlJAUOdNo2lDtg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/uvsO2wgb1gnvZXVaygYejvOSA0zIEw7n69R_XJ63vTSTa6WEqUmVUHQgXcRMaabYZyU=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    40003,
                    "Duskwood - Crime & Investigation Detective Story",
                    "Everbyte",
                    "Game",
                    4.5,
                    94.0,
                    "https://play-lh.googleusercontent.com/Tr8tWAEbqRVtW3E0EBhoQf4A0I0lkVrrRKKUw_5ZmQpLDLCPhq98GQg4ki2mp9Mvt0k=s180-rw",
                    "https://everbytestudio.com/wp-content/uploads/2020/01/Duskwood_FacebookLinkImagePreviewPicture.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/0Tdiv5D01NM6tnd_61rNVpx_QtkbTkBZVOlCqKUtcZS2EOHyD6MA7sgAHJHVTBH3Eo4=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/bc1ZKW4lIq-6xh4qB-j1H3YPWQcwh_iNwpNsBpajp_alL10KvP14OhIMWodJ8e9VLQ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/c_NnZW58aEwOtBtjUCz9HawrQl_bxeuIZVhg9Qk2twvwf6vmQeQSSSlykqH7AHiyNnc=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/1p1vFk1Vlc9PScDR7O5qJN-MeUc7TPA_Nlr3civGpHRaMa3xqZM8K4IZ6srklqmOFUUT=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/T-HTTIF4Iw1s2VDxkG9ZYpJtrfIVwjPUTCNz4LZEDQwqavwfRh9e6i89y9mzEc2UgQw=w720-h310-rw"
                    ),
                    "L"
            ),
            arrayOf(
                    40001,
                    "Garena Free Fire - The Cobra",
                    "GARENA INTERNATIONAL I PRIVATE LIMITED",
                    "Game",
                    4.3,
                    689.0,
                    "https://play-lh.googleusercontent.com/p5p3XOkGw84KJM1c_SZpu-aJUgHLM82MkMQ2ZvVzFyMwQsb0wePF_fLsJEDtEltQ5PA=s180-rw",
                    "https://blog.unipin.com/wp-content/uploads/2020/11/5-event-free-fire-paling-populer-di-tahun-2020.jpeg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/5x_ljj5tq_YDdIZjoQXzB6XFB-fiztph8LX-5lV9ZvDhUZhzbYXabhDQRUasdDj-xqKy=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/Z0b1RuBXLvsNknYtJJBVKozwI9PZhElZg-AGavpnjl0bhRX45qCFncvy6DbOXFM6MaTc=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/ppxXj8TaFsV38TmMKGQ8A7656jkNemFzpgv5jgqtdqdNus82f8OO8ic5cthIV5aNjg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/fifAwLWSkTrJPoDaQDoyXzp-jBgT8vomjzbyq_9ZtVqFfgTy8cw26XLH0mYtrJ87rzY=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/fBPFmXuI3kgWSSN02RopxRgvN2qwzsJmwn-4-5HEPwIe0-lvYsaMT96ghmMigmgAV1w=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/XOioXbFvWnzjBIqQP66gDRH3as9AM2wG56ZhohybY4wCbEHJKKCjpclsh-CtTAoqGYY=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/dfUdbp46NzKsmas6xSl3odg7LBaA0HOg7Q61LNvzY_q3zWz_ZUKyzGWvdjtEDnP7iUU=w720-h310-rw"
                    ),
                    "L"
            ),
            arrayOf(
                    60001,
                    "JOOX: Gratis Musik download, Radio dan Karaoke",
                    "Tencent Mobility Limited",
                    "Music & Audio",
                    4.4,
                    70.0,
                    "https://play-lh.googleusercontent.com/ERcaEpGkbIUMqLHESvFLkl6-g0Tz9g27HxY67ksipw2a5F4fa8YHewLm8xwkzs-FDw=s180-rw",
                    "https://www.marketeers.com/wp-content/uploads/2016/05/ZME9Py_JOOX-Music-Hong-Kong_00.png",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/uT9DQus520WbKEMb_Ebi85AH3hWqTDZp9D-lgHAaOt2o_0Ly73w2DyFvD3AhkPtVdlM=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/qcjscTJDmzBG4Vt-oLB1pEe_zi1EA0VGEN48DQF31pZP1kWa7DDZShTJ83J2bsqfMQ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/q674DitqNXG0qhdR1rEk-sISaABM0hY_VBHNYtmbO-lyRFDmECbHbb-pvwlze6fVTg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/oJsaa1o1kNlkdo6tVy5jZbMoR620XRunUSFWHBPqZGP6VnCXpogbEW1SZIyl2wZvIQ=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    20001,
                    "LINE: Free Calls & Messages",
                    "LINE Corporation",
                    "Communication",
                    4.1,
                    83.0,
                    "https://play-lh.googleusercontent.com/74iMObG1vsR3Kfm82RjERFhf99QFMNIY211oMvN636_gULghbRBMjpVFTjOK36oxCbs=s180-rw",
                    "http://static.rappler.com/images/Line-BannerImage-02142013.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/tAGDg_q-9RkeYE9fLjhniUdL31IEaEhJW8FHl3408W-1lfS-EOdvnhDNdneMSS03l88=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/wXU1tfIHqYp_9Gzw3AEOaojxZcIXn20au94Tf4Uc2rnRaku_39bdDR_09vnbC0oUJhk=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/SdCiqDkKUARbo6MF3Ms3rqdMLNZlWI1Y0XhudHT0uc8fkQpuN0y8K2E6SptxEJxESuer=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/ghj2SWO9eb3Zy-xXh7MvKQGPNWT68r5E8sTZWVpfiTjxc8lS1iorAPP4YbVKkQIsCww=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/h5rcueYbD2WQtWY1PMdzz0bGppWfQnEjWFUKcoYOEp0ZjffziqvLuw1F70CJUB-gsRw=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/2W_n6HEDAwm-I4_mhVsQEel2UqIQx64w4c7DMBUS4qSnaEmWY98ulCRsjXuNgfOciUo=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    40002,
                    "My Talking Tom 2",
                    "Outfit7 Limited",
                    "Game",
                    4.3,
                    110.0,
                    "https://play-lh.googleusercontent.com/csbgJoZuJQc8s6jJw7c4QbS4_n-wXs9IPhOhCwLDRo79G6C8EIo2ZTiiEx45DqI-LoU=s180-rw",
                    "https://image.winudf.com/v2/image1/Y29tLm5zbG9ja3VudXMubXl0YWxraW5ndC5qdXN0c2NyZWVuZ21fc2NyZWVuXzRfMTU4Njc3MzkxOF8wNjA/screen-4.jpg?fakeurl=1&type=.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/JCirZ4NO9EvzQf2YgvMR-tN-DmdmbIrhb2a0ujJwiybhuF7ZkCwWVyCyaUkG8prwcgQ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/9tQebNi_Uz7gqZ59zPV17Ofw1A40f5-ES7EwVGjSo1Tk9YPmXf1zpiH4nDKckdRK9DQB=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/PSd_9ghHHpV5U6aFOgxz-0Y64Bxt7ipHIqpHe_5wnwvEf3iFqPqmm-xvyx-MY04-KpOM=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/LMXGGxuvhOq5568QlylLJmRHjMx75nB5nPwI8RB8HTuzYN_CaLY7x199V2T-V7rAab3c=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/TuZ9ltl-m3oubaiLzzdpoPG4UZCAgYtwE4CF31KVvM1FVUBWxN2ImS7jjypuJnlu2-A=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/MFdQjgN5g7a4qbp9IIPxaD_6AJ6AWOKiAgE26XrYhHwFR0jBFfFyC3ko_h02uayYW4Lg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/7VVRrRByw6oYYnTs9VFf09eg-DDjONO4k888Z0FVqV2W4UmV9RotPMzViq_uFDFBRiE=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/AlKVh8bKyyMWdpvzffMmzrMwK9k_CtqYFtwWr6hVPYIoePDS6ZSftk4T3hpY_1oxdA=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    30002,
                    "Netflix",
                    "Netflix, Inc.",
                    "Entertainment",
                    4.4,
                    17.0,
                    "https://play-lh.googleusercontent.com/TBRwjS_qfJCSj1m7zZB93FnpJM5fSpMA_wUlFDLxWAb45T9RmwBvQd5cWR5viJJOhkI=s180-rw",
                    "https://assets.nflxext.com/ffe/siteui/allow-robots/contentSampling/seo-watch-free-link-preview.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/m7mg_DZ1uTb6jfGewOOtZ4ejmDaBYfEWZVfEP0pkSX60OsoG7YDgjuFLPCCc6rBnYJk=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/K4-4tkQJD0U0H_FiAn5yHz_-9Y8bP6f1tGCmFtYwBzn-5Gk1AM8Ga4S3c0T6s4ex_HI=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/vbM5loA-4NmmAur0wQP4JO1karlDkNrnQBJaGqYfriQ_NbABz3D1Uon5NlbuXqOz4u8Q=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/ihMmPJuDjrv9o_ZOk21a2HfxogKJMLG7z2GLVETOPpzZ7Ngc1Ir7OvhgqCUJCrGrrI0=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/MoDDlwrVwEGdpYwpFAFQ_c6FBOONb-7-w-ShocUe2kMFZeozKQ0Ch8fBOT9QLiVpGg=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    70002,
                    "PicsArt Photo Editor: Pic, Video & Collage Maker",
                    "PicsArt",
                    "Photography",
                    4.2,
                    37.0,
                    "https://play-lh.googleusercontent.com/m-tgJ-qDeuO8c9T58FDhYSwH30N6j8wBK79y66tIgCZJnAnPb8e_E3HrRxpnd1A90iHO=s180-rw",
                    "https://i.ytimg.com/vi/y_ytgbfr3rU/maxresdefault.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/jhbloziAZnHEXPHwaLeO5lc6-bPYeeIcwezPpBI9kbJzC7dXC4hzLlFTvmFpTk5db2nZ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/twGftEvlcBF1ojtf_HfZyr5ivXbfXgesqJgUXVoPO58eiEYbYutf9QFa9uxS3z6zacU=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/clZfP2OBUMzoTu81OoWTpZpj1f5qjwtvH4bmHTVtfNVANbKw-zROiMpuov3X3VcEU7c=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/CodXVNxrnMojFKYJA4pLdhWbQDQjcBeGkaIn6UPWPO6cO_TyPPEI5b-bCY-DooHKBcI=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/CABxkHt8-cgJbWfJfwein5K9a9o4NCW38qGKYKA8B0elgIQrGGDgJA38Cs824QRn-_4=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/79qYivc_eXzI-0bazRpeq63idMOpnrCumFR85s4fKxRYA98uQZzacsl1I0DvbLmf_bE=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/s1FmGnhvP0dPVwUNymPUmoTCxEnqVV_XBapUUzT74NBWfP4OJTf960_c2BB6dPeRlQFW=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/--5bHr_V_Sd4Qv2Zg9sPG9AyOJeUXNrfkuf6_W_GyiGBHXHmA_VeXm90mLm1IG9-JBs=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/FBEDVIzvDzM-eMdAlrB5HLhEhi0SkUGNykSIABprCtyhRtm5Ze_WKMdX9YCtdL0m5t7X=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    50001,
                    "Pinterest - jutaan inspirasi dan ide kreatif",
                    "Pinterest",
                    "Lifestyle",
                    4.6,
                    20.0,
                    "https://play-lh.googleusercontent.com/dVsv8Hc4TOUeLFAahxR8KANg22W9dj2jBsTW1VHv3CV-5NCZjP9D9i2j5IpfVx2NTB8=s180-rw",
                    "https://cdn.searchenginejournal.com/wp-content/uploads/2018/04/Pushing_PInterest_Limits-copy-1520x800.png",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/G-ANHfSuOECzfpE_1CeCtVCxJoM358zFhqhkgwQEyAzoUzfsqWJPI1ABkO12nr3q-w=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/_YAC4Dyq9QQ1p0ickRoY5yqFHqLaW2nbVxApYe-3dHFwKOJPqJBJRWvUq7pHJbmeG74=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/BNi1SwEe541jOzfjPDeMxTKyEw4bsDPel0C-GPIDhMNLUzPuWoo-ON4OTrxIfQMCBA=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/L_tdvM0LxF6vWOXalDm1YmVOrdXGiQWR1ihd9kO03xI9V6-kaSt7fo3Z2BlW05bUxg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/nxaxM5Rhdo7kVqE6CWdz2Yf-xZXUb6lTAGwFFwjvYoYYBo7v0gV6fm-IpEqOYJrQlPE9=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    40005,
                    "PUBG MOBILE - DREAM TEAM",
                    "Tencent Games",
                    "Game",
                    4.2,
                    626.0,
                    "https://play-lh.googleusercontent.com/JRd05pyBH41qjgsJuWduRJpDeZG0Hnb0yjf2nWqO7VaGKL10-G5UIygxED-WNOc3pg=s180-rw",
                    "https://images.bisnis-cdn.com/thumb/posts/2020/01/10/1188770/games-pubg.jpg?w=744&h=465",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/_gIqfPiBDvNhJuIuOvm4Q1iZcchs2L72yBaarlaoJlSk_KLogPBx_pfOSgcEAb1CWUI=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/tckAsbCpjO3ACpjci43-nLqHBeddGztvD4AXhBbfmLyuKfgCAlk8AnaSWmCZCA7g9KY=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/GKc4XW9RqqVK4gYkS18h2agnHiHF__q1s4zeXHryGH2fK0iRgryB4CTIcpV7vPz6gfpx=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/dqE5rPQiRjQFskHGKrLo00gVvCBHGhGTznRMReJEhAwMa1OLzjcHgghbFwghWAC0QBY=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/A0zfxyrE4Q4Fbs3G2gY0KQjxTaSpqW_fNDVpKxlClJdU06ndnbWy0ySfNqgu3EW0Tw=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/EMcsGEo2JX0XMlR5YSc6lAb5-4pYdWvOaCNRFjs4iKF1eQo-A_38Tx0dqRUHj39PKOM=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/DDPqveOgtBz8xdmfaWM0vcNcXy4uLUgm6wuvm9KlPlOKG_UVE8Lg2CQAlYh0feWX6cU2=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/B9SOYSHQy7n-80x-YmdHaONxAw5zFXW6HX2cdwXBtzY8u8WapfA2707EdD8NX_y8t4g=w720-h310-rw"
                    ),
                    "L"
            ),
            arrayOf(
                    60002,
                    "Spotify",
                    "Spotify Ltd.",
                    "Music & Audio",
                    4.5,
                    27.0,
                    "https://play-lh.googleusercontent.com/UrY7BAZ-XfXGpfkeWg0zCCeo-7ras4DCoRalC_WXXWTK9q5b0Iw7B0YQMsVxZaNB7DM=s180-rw",
                    "https://beritakini.co/files/images/20201128-spotify.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/Dr7MDuMlaKuvJ02UliCp8LjY9RK2cE5E3Hp5qqogTRlBwBbxmiKjqp-J_CFAyaWuzEM=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/pfEKLi66mbICrof3d38rS4Y5d-r-5XoIWBq3uGoYQLbKhHFGfBglIMZyR2ZadG2npWk=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/WHH0kJk2PVkM4Ej0zrg_yHFmS-g6MeZUPotHsXfQFCfHgX6d2Gcjr6VC9OuP7B4DYHY=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/BgVlFMXuaKnq1vn4nULktC-UpSsyZtNgonCqBm53Qnlh-mvyy9Kq3WwiY0KPnjD_Vg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/E0dMHb0sZINJPHUA8DCYmQ-8VpiCmMzf2Fk6lutcLUg1HwdkhnDGHttz5L4Yx1p4uw=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/ass_Zz4An4x1km46Cdln5xx6B5l70pDD8Z38-NxDl_6EH61x9KDFQXmko_jffPlMbxI=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/NDt45xuHvBb6wRA4bDvGFghPx-CuJ4T_rdjXz-RFfv-cN6OTHYbxZn7gEhcYuBJQ5PQ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/TzU0OALClf7QmVTGYAYUQyk-o_yMxAE4GOVp-5DDrKmo6FUE-1V-SDXDbQUXlBk5CA=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/34bM--9HYK6sJkaG5a7tu2zEAg4hUy6JC7gMRvBqyQBl6A5ZoBVBNI3w7f3jKO_8vQ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/dZC2vJgTOyTV6iK6U_MxrrvGynvXEDeo4mpZGzuoUGlMue2QhB3vtKDbFfILa7KYCw=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    40004,
                    "Tiny Room Stories: Town Mystery",
                    "Kiary games",
                    "Game",
                    4.6,
                    135.0,
                    "https://play-lh.googleusercontent.com/3f5JWx4kqQ3zdMYEKk8IBxR1_TDM-iWFxfHCc51dmElYtK9gC470OQnbf5rO6YkcVg=s180-rw",
                    "https://cdn.cloudflare.steamstatic.com/steam/apps/1259640/capsule_616x353.jpg?t=1614992257",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/zSLl_orid4BPjSySqrzrGU-EQqSM9OjwUF5qz35GswGIT0jZGQnsKCB8SbxhBCz8SA=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/1h17FHbrVydSbaWpdIPgi5F0oq19suPciUtk48ZjE3FD1DlWIfdr_sBBFgs7psS455I=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/EIQoGMmnRJWeJmGvPGV3dRnJsihJ6cWjDBkFJIvpdBLrc32XzGaQFNFcsbwDWUsUhmYs=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/Vjy3q3ZqSpNwZlcS81F1cXXp-TvLcbNUoKR_Z_R1_3_VzeTplx3lYbgm1z6y0Zfo_A=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/EaJQocIlJGP3oojdt2ckyB4mqqSMuomqN7Ll6QzXo0MOrd2WpUnzwIbQvNT9iv8Gehg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/9gLLz6BG5eGaXogAW9Zg7OVE0ibEJZVtp6DjwybreovcsckcdYmFSSQ7MtvEfsAs4iI=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/r9DDWZmfhUzBVGdHqBGLjl8-gsg6mcE37C57m8qCrUd0sGn9I3uFsEFII74CKiQ6Csg=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/TDHIqFZaciWi6KhoERk7lENmc6i8JHO1oqCtXbNuaeEAJbaeubyypQ6uosStoOpEaUc=w720-h310-rw"
                    ),
                    "L"
            ),
            arrayOf(
                    80002,
                    "TikTok",
                    "TikTok Pte. Ltd.",
                    "Video Players & Editors",
                    4.5,
                    35.0,
                    "https://play-lh.googleusercontent.com/z5nin1RdQ4UZhv6fa1FNG7VE33imGqPgC4kKZIUjgf_up7E-Pj3AaojlMPwNNXaeGA=s180-rw",
                    "https://api.jatimnet.com/jinet/assets/media/filer_public/24/90/24905e64-fedd-4f01-94e3-c87e5d46b91f/tik-tok-douyin-taking-the-world-bytedance-feature-image-1.png",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/nTGPbQcNQZDDZMtaRIWqWz-bLcPB71WZd6BJpgeZCsOfuqymVfwarnJFqOzFMY_p0b0=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/wHk9HZ7C1QtqS3bCOEMro4RuT43qOg4W8353bjb3fnD1bXVMIDDAUUG0GObrp0Ypc7o=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/BuprZwckxZ4wvh8FU2AP-8HuObGcrm_H-reIOKe-4WPh-eH3EPM4S8RzkcDCQEyFlE0=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/1YlGNlOW59fFfRi0P08YhUwY2ije0DwGPrCJiOKIEeXg-VPCrHm98722yo_HsHycMjo=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/AMsLvVVO_bG759TrsSQG_R43Bbyet3uYj6dX4JuLw4rwQVnVFj-PeLAI2VEkyd7anIs=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/pp7P_oUV4MlVpBCKjwT0_lHF4Pw3EB9SK-pzDZjelx8LdPRtWE4zFxdYiFgjXv7XfwY=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/YzzvGPMwjfwabhwMn7xnKCwlatbVuLzT-QVSTYtYdp2bDabhPKY0guI88naZt7Hgs_39=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/dv3ONOMrcv8_7GT7kVcdo_4tuJDAvoEIh1LAOK2oaB7f--dbHXCFxIUNXm6PckcBEUo=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    50002,
                    "Tinder - Match. Ngobrol. Bertemu.",
                    "Tinder",
                    "Lifestyle",
                    3.3,
                    46.0,
                    "https://play-lh.googleusercontent.com/fDpoqIbZ884ylRnMK8Lx9Fu4DsLQk5yt4f9WkxeOAPpGnzc9BTi_YKkMsLvoMdx7Uzg=s180-rw",
                    "https://pyxis.nymag.com/v1/imgs/f2b/57d/779f3b7d9b8cc2d0ad9fa57db0295e5969-23-tinder.rsquare.w1200.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/Tujxh7Botfy1buA5fF_fxqLAh9dPnACTuS588LicYksMIsfyoj_sMrDV7KeLankaeXjB=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/rDePBW7Jrlg64IQi_6vDUgXjewuQZLOgkxPEbmDBBDrrPq0hmXwrVte_1ZcRUkP_2Vc=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/BUlWskuExNBIBQviiBM1gZR3xPMRtA2ukF5sHZSmOdFIiPW0eV_6RPi-N3Fb7_OCrA=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/MSTKGRbrfxbRURkYFQ47c4nnwZNOM6TLyXl7OjEtO-OD9q5u_Zb3NII6xopSnVumlKI=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    30003,
                    "Twitch: Livestream Multiplayer Games & Esports",
                    "Twitch Interactive, Inc.",
                    "Entertainment",
                    4.4,
                    37.0,
                    "https://play-lh.googleusercontent.com/QLQzL-MXtxKEDlbhrQCDw-REiDsA9glUH4m16syfar_KVLRXlzOhN7tmAceiPerv4Jg=s180-rw",
                    "https://gamebrott.com/wp-content/uploads/2020/06/twitch.jpg",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/S5ZeXQLvnShTvfAgmJhbF06r3oqvgvKliDw-ltBj9kGj4AEGKyiwYVDWcZcKRmIULf8=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/ieb_1PyDMt80BRgoLVEXJJDG5SD_31VKWlsqoZKfkuW8la3pI3l5u-GJF1nDi2Ac2A=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/oKXsEVjiC9bNiF24Lg-ET2xt8kj9yfbVHMwazIUt5pbuBnThKtUvIqtjflsbatMvi_VV=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/s3Jzk5eL3sir6c8JMmyvce2iq5I193az0TxpKJTcrB9V73uRZ6enJ-S27xuG9Xcx3EQ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/x9wlhKrQ3xBjw-l-g6g-s_IN5rrZixUIy3-fkP_6thWDZcoopLvRyVcoZAtv1cze9-g=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    30004,
                    "Viu - Drama Korea & Asia Terbaru, Sub Indo",
                    "Vuclip Mobile Video",
                    "Entertainment",
                    4.2,
                    43.0,
                    "https://play-lh.googleusercontent.com/-Bac1Iy76MPn8MQJCVrrIdJjo4cJJsvWJNGLoTGN6-fEfaVeKhzXYKN94umQvI7vdwE=s180-rw",
                    "https://img.tek.id/img/content/2021/02/11/37329/viu-raih-posisi-pertama-dengan-pengguna-terbanyak-di-asia-tenggara-bXaGpWuMWm.png",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/0uHPn2G7oFRlxnaKe1H6hqurHF_FNQvS2SMblQLLCkXWUoAjxL2zPn4CzCDIbNOPOA=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/MGCf8K63F1XgABYV-pTHa10JrbuIN8eGBHUws7eiru0QYfgEqgqB-FoCRIqGkSJAriw5=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/Mt4Q9EUbaNq5kxCDGCn5x88w8cTz70tAaZ1iQRzU5SAIN9kYFXxA4rc7hAgQrmMSOYo=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/5-ESAq3ayZiibq-sSZKAIn_rBM_yxKRhX2Vgi8JBdZIqLrW1k-rQbCMdkAsMu4DVHJXx=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/0Fj8EseZBmOl6YdnR5kSJ1HdWEbsaU4joTCaB6KVy3sxwpoCM3X1O9QEJtXq1pRU3A=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/ZAf9pinp1lfMA9Pmfw3T1aTBM8Rbw5k2Jcf_0QAKhnp4Osv_y_dwhPQDzKeSa4U0BsQ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/RTNnAaeJTUfguEP0UGr_L2gCcNLlXLbccTv_DiUv13eNnuyqLFWokbuZ54ZqyuMcQXHZ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/LzF87QNLG9aJH09veNHPPtWL-AKsLS4jltoVkZHfXyQ1cdasva7JGof6jM8m0HNktMSA=w720-h310-rw"
                    ),
                    "P"
            ),
            arrayOf(
                    20002,
                    "WhatsApp Messenger",
                    "WhatsApp LLC",
                    "Communication",
                    4.2,
                    27.0,
                    "https://play-lh.googleusercontent.com/bYtqbOcTYOlgc6gqZ2rwb8lptHuwlNE75zYJu6Bn076-hTmvd96HH-6v7S0YUAAJXoJN=s180-rw",
                    "https://images.bisnis-cdn.com/posts/2020/12/19/1333190/whatsapp-indonesia.JPG",
                    arrayOf(
                        "https://play-lh.googleusercontent.com/MMue08byixTw74ST_VkNQDUUJBgVEbjNHDYLhIuHmYhMIMJIp3KjVlnhhqZQOZUtNt8=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/foFmwvVGIwWWXJIukN7png18lFjFgbw3K7BqIm8G-jsFgSTVtkCa-dDkFApUzbvzIvbe=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/iLgMXFO5qEPlTffpI21zaoG51AORnfu8NPb_2SdAXYgOYcb-xDOMfCryPhVvGNjoew=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/ElfUPGX67gv0TNQXuDxQGa5a4BYnLAZIgJJmoNoARvqlLQsKEQcNNWz-J_zqGV5vzQ=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/wBgVA58O2xncQkksLatHGoNLI8L6o_1ZM8AC3GCScxCyaDOWOvMsMilaj1Scp3kEOIw=w720-h310-rw",
                        "https://play-lh.googleusercontent.com/nknhZ6--QSyZlohrv72BaPlwO2EHPvGKJY8NNACYY0IY8j4QKYATP6alT1yyMYb-35j9=w720-h310-rw"
                    ),
                    "P"
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
                app.appBgDetail = data[7].toString()
                app.arrayDetailBanner = data[8] as Array<String>
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
            val sortedAppRating = hashMapOf<Int, Double>()
            array_of_apps.forEachIndexed{ index, data -> sortedAppRating.put(index, data[4].toString().toDouble()) }

            //sorted data ratting (Best Ratting -> Worse Ratting)
            val temp = sortedAppRating.toList().sortedByDescending { (_, value) -> value}.toMap()
            //get all sorted index
            val arrayDataIndex = temp.keys.toList()

            for (i in 0..9) {
                val app = App()
                app.appID = array_of_apps[arrayDataIndex[i]][0].toString().toInt()
                app.appName = array_of_apps[arrayDataIndex[i]][1].toString()
                app.appSize = array_of_apps[arrayDataIndex[i]][5].toString().toDouble()
                app.appLogo = array_of_apps[arrayDataIndex[i]][6].toString()
                list.add(app)
            }
            return list
        }

    //get data from Category Apps
    fun listDataCategory(categoryName: String): ArrayList<App>{
        val list = arrayListOf<App>()
        for (data in array_of_apps) {
            if(data[3].toString().equals(categoryName, true)){
                val app = App()
                app.appID = data[0].toString().toInt()
                app.appName = data[1].toString()
                app.appSize = data[5].toString().toDouble()
                app.appLogo = data[6].toString()
                list.add(app)
            }
        }
        return list
    }

}