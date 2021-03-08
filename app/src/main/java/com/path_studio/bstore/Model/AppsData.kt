package com.path_studio.bstore.Model

import android.util.Log

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

    App Rate (Using Other Countries)
    - 3+
    - 7+
    - 12+
    - 16+
    - 18+
     */

    private val array_of_apps = arrayOf(
            arrayOf(
                    70001, // App ID
                    "Adobe Lightroom - Photo Editor & Pro Camera", // App Name
                    "Adobe", // Developer Name
                    "Photography", // App Category
                    3, // App Rate
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
                    "Adobe Photoshop Lightroom is a free, powerful photo editor and camera app that empowers your photography, helping you capture and edit stunning images.\n" +
                            "\n" +
                            "Easy image editing tools like sliders and filters for pictures simplify photo editing. Retouch full-resolution photos, apply photo filters, or start photo editing wherever you are.\n" +
                            "\n" +
                            "EDIT PHOTOS ANYWHERE\n" +
                            "Transform raw photos with one of the world’s most intuitive photo editing apps. Tap and drag sliders to improve light and color, apply photo filters for pictures, and more. Breathe life into your photo editing with leading photography tools.\n" +
                            "\n" +
                            "Retouch light and color to make photos pop. Easy sliders let you control photo properties from your phone screen.\n" +
                            "\n" +
                            "Crop and Rotate tools find the right size and aspect ratio to best show off your camera work. Create clean shots with straight lines by adjusting the perspective with powerful upright, guided upright, and Geometry sliders.\n" +
                            "\n" +
                            "Experiment and compare different photo versions without losing the original and pick your favorite look.\n" +
                            "\n" +
                            "Access all your presets anywhere. Image edits on one device are automatically applied everywhere else.\n" +
                            "\n" +
                            "EDIT THE FINE DETAILS\n" +
                            "Finesse details with the advanced picture editor. Control images with selective adjustments. Remove almost anything with a touch of the Healing Brush. Local Hue Adjustments as part of selective edits let you alter hue and saturation with precision and elevate your photos. Have more control with advanced color grading and achieve stunning effects. Import your own graphical watermarks and apply your personal touch.\n" +
                            "\n" +
                            "Easy, interactive tutorials from fellow photographers teach you to use the photo editor to its potential.\n" +
                            "\n" +
                            "LIGHTROOM PRESETS SIMPLIFY PHOTO EDITING:\n" +
                            "Achieve professional photo editing faster with presets - filters for pictures with unlimited customization options. Presets make each step of photo editing visible so you can learn easily.\n" +
                            "Combine presets to recreate your favorite photo effects perfectly every time with one click.\n" +
                            "\n" +
                            "PRO-LEVEL CAMERA\n" +
                            "Unique phone camera controls unlock your photography potential. Choose exposure, timer, instant presets, raw and more. Enjoy more control over your photography with capture modes like Professional and HDR.\n" +
                            "\n" +
                            "SMART PHOTO ORGANIZATION\n" +
                            "Adobe Sensei harnesses the power of AI to tag and organize photos based on the objects or people that are in them. A quick search for “mountains” or “Maria” will display all the relevant photos. Use handy organizational tools like ratings and flags to mark and group your favorite photos, and see suggestions for the best photos across all your albums.\n" +
                            "\n" +
                            "ADVANCED PHOTO SHARING\n" +
                            "Group Albums let you invite others and collect everyone’s photos in one place. Share your creative process with users in the Discover section so they can see how you got from start to finish. Lightroom galleries showcase your photos online. Photo edits sync seamlessly so any changes you make are always up-to-date. Get inspiration from other creatives in the Lightroom Community and see personalized content in your feed.\n" +
                            "\n" +
                            "Follow your favorite contributors and get inspiration for your work.\n" +
                            "\n" +
                            "EASY ADOBE CREATIVE CLOUD STORAGE:\n" +
                            "The Lightroom image editor is the best cloud-based service for photography lovers.\n" +
                            "Retouch full-resolution shots and have originals and edits backed up to the cloud, ready to access anywhere. Searchable keywords are automatically applied to help you sort photos without tagging.\n" +
                            "\n" +
                            "*Full raw HDR capture mode is currently supported on devices that contain advanced processing and memory capabilities including but not limited to devices such as - Samsung S7, S7 Edge, S8, S8+, Note 8, Google Pixel, Pixel XL, Pixel 2, Pixel 2 XL, Pixel 3, Pixel 3 XL, and OnePlus 5.\n" +
                            "\n" +
                            "Fine Print\n" +
                            "You must be 13 or older and agree to Adobe’s terms and privacy policy:\n" +
                            "http://www.adobe.com/go/terms_linkfree\n" +
                            "http://www.adobe.com/go/privacy_policy_linkfree\n" +
                            "Do Not Sell My Personal Information: https://www.adobe.com/privacy/ca-rights.html", //App Description
                        arrayOf( //Developer Contact
                                "https://www.adobe.com/products/photoshop-lightroom.html", //website
                                "LrAndroid-Feedback@adobe.com", // Email
                                "Adobe Inc. 345 Park Avenue San Jose, CA", // Address
                                "95110-2704", //Phone Number
                        )
            ),
            arrayOf(
                    10001,
                    "Canva: Graphic Design, Video Collage, Logo Maker",
                    "Canva",
                    "Art & Design",
                    3,
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
                    "P",
                    "Canva makes design and video editing amazingly simple (and fun)! \uD83D\uDE4C Create stunning logo & poster designs with your photos and videos—even if you’re not a design expert!\n" +
                            "\n" +
                            "Canva is a free, versatile graphic design app, Instagram story maker, and video collage creator. Use it as a book and mood board creator as well!\n" +
                            "\n" +
                            "Design your Instagram Highlight cover, Instagram Story or no crop posts, create a logo and banner for social networks: Facebook, Pinterest and Twitter. You can also make birthday invitations & wedding invites.\n" +
                            "\n" +
                            "Stay on brand with our logo creator or logo designer for your business cards, posters or Instagram posts. Available on your phone & computer to jump back into your design anytime, anywhere.\n" +
                            "\n" +
                            "How to Use Canva\n" +
                            "1. Start from scratch or a ready-to-use design\n" +
                            "Create a design with our blank canvas, or save time and use any of our 60,000 FREE templates created by professional designers, including a logo & video. No need for a tutorial or to hand draw designs. Use our logo designer & logo maker, poster and video editor tools for your masterpiece.\n" +
                            "\n" +
                            "2. Use the perfect image\n" +
                            "Upload pictures and videos from your device gallery, or pick from our library of premium photos & illustrations to make the perfect logo, poster and video.\n" +
                            "\n" +
                            "3. Edit & add text to photos or videos\n" +
                            "Easily add quotes or multiple text to any graphic. Change font (we've got 500+ options!), size, color, spacing, and position.\n" +
                            "\n" +
                            "4. Edit pictures like a pro\n" +
                            "Use our free image editor to apply photo filters, change brightness, add vignette, and more.\n" +
                            "\n" +
                            "5. Show it off to the world\n" +
                            "Share designs directly to Instagram, WhatsApp, email, or simply save to your device.\n" +
                            "\n" +
                            "Use Canva for Social Media\n" +
                            "• Create a memorable instaquote with the Instagram Highlight cover, Instagram highlight icons maker, and Instagram story maker\n" +
                            "• Create Facebook Posts & Facebook Covers\n" +
                            "• Design Pinterest & Twitter banners & thumbnails + video editing app for Youtube\n" +
                            "• Make cards, evites, photo collages & use Canva as a picture maker, poster creator or logo creator for all social media\n" +
                            "\n" +
                            "Use Canva for Everything\n" +
                            "• Logo designer, book cover, blog design for any project\n" +
                            "• Evites for any event: birthday card maker, wedding invitation maker, evite creator\n" +
                            "• Simple, free image editing app\n" +
                            "• Photo collage maker, flyer maker, banner maker for any occasion\n" +
                            "• Design motivational quotes and humorous memes\n" +
                            "• Stunning Instagram Story templates\n" +
                            "• Free Instagram video and movie maker editor; edit video templates\n" +
                            "• Party invitation maker, school poster maker, video banner maker\n" +
                            "• For business: logo editor, brochure, resume, presentation, promo poster maker\n" +
                            "\n" +
                            "Create Designs Quickly\n" +
                            "Use Search to find templates faster. Type your theme: \"birthday card,\" \"baby photo collage, \"sale flyer,\" “save the date card,” \"music poster maker,\" and more.\n" +
                            "\n" +
                            "Collaborate on Canva\n" +
                            "Create a free team to easily share & edit designs with friends or colleagues. Work together on presentations, business cards, brochures, & other design needs. Upgrade to Canva Pro to set your brand colors & upload brand fonts.\n" +
                            "\n" +
                            "Canva Makes You Look Good\n" +
                            "Use Canva as an invitation creator, poster creator, logo maker, online invitation maker, business card maker. Add a video to your next Instagram Story to make it come to life!\n" +
                            "\n" +
                            "---\n" +
                            "Follow @canva on Instagram for design tips. Got feedback? https://canva.me/android/\n" +
                            "\n" +
                            "Permissions:\n" +
                            "READ_EXTERNAL_STORAGE: Add images from your photo gallery.\n" +
                            "CAMERA/WRITE_EXTERNAL_STORAGE: Take a photo in the app & store designs in your gallery.",
                    arrayOf( //Developer Contact
                            "https://www.canva.com/",
                            "android-app@canva.com",
                            "110 Kippax Street, Surry Hills, Sydney, NSW 2010, Australia",
                            ""
                    )
            ),
            arrayOf(
                    80001,
                    "CapCut",
                    "Bytedance Pte. Ltd.",
                    "Video Players & Editors",
                    3,
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
                    "P",
                    "From today, \"Viamaker\" Officially renamed to \"CapCut\"!\n" +
                            "\n" +
                            "CapCut is a free all-in-one video editing app that helps you create incredible videos.\n" +
                            "\n" +
                            "「Easy to use」\n" +
                            "Cut, reverse and change speed: getting it just right is easier than ever，Posting only your wonderful moments.\n" +
                            "\n" +
                            "「High quality」\n" +
                            "Advanced filters and flawless beauty effects open up a world of possibilities\n" +
                            "\n" +
                            "「Top Music Hits/Sounding incredible」\n" +
                            "Tremendous music library and exclusive copyright songs\n" +
                            "\n" +
                            "「Stickers and text」\n" +
                            "Top trending stickers and fonts let you fully express your videos\n" +
                            "\n" +
                            "「Effect」\n" +
                            "Get creative with a range of magical effects\n" +
                            "\n" +
                            "Contact：capcut.support@bytedance.com\n",
                    arrayOf( //Developer Contact
                            "https://lv.faceueditor.com/en",
                            "capcut.support@bytedance.com",
                            "",
                            ""
                    )
            ),
            arrayOf(
                    30001,
                    "Disney+ Hotstar",
                    "Novi Digital",
                    "Entertainment",
                    16,
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
                    "P",
                    "Disney+ Hotstar is the streaming home of the best global and Indonesian hits all in one place. With unlimited entertainment from Disney, Pixar, Marvel, Star Wars, National Geographic and many more, there's something for everyone.\n" +
                            "Watch on your TV using Chromecast or download Disney+ Hotstar on your Android TV.\n" +
                            "\n" +
                            "With Disney+ Hotstar, you can watch:\n" +
                            "• Global hits from Marvel, Disney, Pixar, Star Wars and many more\n" +
                            "• Exclusive Indonesian premieres\n" +
                            "• Disney all time epics\n" +
                            "• New Disney+ Originals\n" +
                            "• 300+ popular Indonesian movies\n" +
                            "\n" +
                            "Enjoy these features:\n" +
                            "• Watch on your TV using Chromecast\n" +
                            "• Choose your streaming quality (from full HD to data saving low res)\n" +
                            "• Indonesian dubbing on global blockbusters\n" +
                            "• Watch on two devices at the same time\n" +
                            "• An ad-free experience with no interruptions\n" +
                            "• All movies and shows available to download\n" +
                            "• Download Disney+ Hotstar on your Android TV\n" +
                            "\n" +
                            "Images shown are indicative of the content available, will vary by country, and are subject to change.\n" +
                            "\n" +
                            "Terms of Use: hotstar.com/id/terms-of-use\n" +
                            "Privacy Policy: hotstar.com/id/privacy-policy",
                    arrayOf( //Developer Contact
                            "https://www.hotstar.com/id",
                            "disneyplus.id@hotstar.com",
                            "Star House, Urmi Estate, 95 Ganpatrao Kadam Marg, Lower Parel, Mumbai - 400013",
                            ""
                    )
            ),
            arrayOf(
                    40003,
                    "Duskwood - Crime & Investigation Detective Story",
                    "Everbyte",
                    "Game",
                    16,
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
                    "L",
                    "A realistic criminal case featuring real people… including YOU!\n" +
                            "Fans of investigation games \uD83D\uDD0D, watch out: This criminal case is special! \uD83D\uDD2A❤️ Start your mystery adventure now and reveal the hidden secrets of Duskwood!\n" +
                            "\n" +
                            "It's been 72 hours since Hannah disappeared without a trace. Out of nowhere, her friends suddenly receive a message from the missing person's phone. The mysterious message only contains a number... your number!\n" +
                            "This is how your investigation story begins: Will you be able to find Hannah? Will you be able to protect her friends and yourself against the evil? Outsmart the killer and become a hero in this detective murder mystery story!\n" +
                            "\n" +
                            "\uD83D\uDD0E Investigate in an exciting criminal case Collect hidden evidence, talk to many different characters and solve mysterious puzzles\n" +
                            "\uD83E\uDD14 Make decisions/choices Be real! Be yourself! This crime investigation adventure is about you!\n" +
                            "\uD83C\uDFAC Images, voicemails, mini games and videos In addition to text messages and choices, you can expect varied media and game content\n" +
                            "❤️ Make new friends Join the crew and make new friends. But be careful who to trust...\n" +
                            "\n" +
                            "Duskwood is the the most popular detective game of 2020! Join millions of players and start your investigation story now!\n" +
                            "\n" +
                            "\n" +
                            "STORY\n" +
                            "Duskwood is a small, sleepy village surrounded by a dense forest. Strangers rarely get lost in this remote area and when they do, they always describe the place as weird or even scary. The locals of Duskwood have never been worried about this. However, in the last 72 hours, many things have changed and even among the villagers concerns are growing: A girl has disappeared and the mysterious legends that are surrounding the ancient forest seem to come alive...\n" +
                            "\n" +
                            "\n" +
                            "\uD83D\uDE31 Realistic & Exciting Crime Fiction Play the interactive mystery novel in a real messenger\n" +
                            "\uD83E\uDD2B Secret Agent Spy Mode Secretly read chats of others. Psst…don't get caught!\n" +
                            "\uD83C\uDFAE Completely free to play You don't have to spend a buck if you don't want to\n" +
                            "\uD83C\uDFC6 From the author of Dead City Duskwood is the brand new criminal detective story game by the author of the worldwide hit Dead City. Head into this new investigation story game alongside thousands of fans!\n" +
                            "\uD83E\uDDE9 Additional crime content and updates The games criminal case is constantly being developed. The next update will be released soon!\n" +
                            "\n" +
                            "Download now, become a detective and outsmart a killer in a thrilling criminal case investigation! No worries - Duskwood will remain free in the future, too! You can support the development of the game through in-app purchases if you like ❤️\n" +
                            "\n" +
                            "Be part of the Duskwood Crime Series! Play Duskwood now!\n" +
                            "\n" +
                            "DUSKWOOD IS RELEASED IN EPISODES\n" +
                            "We decided to publish the interactive story Duskwood in episodes. Not to annoy you - quite the contrary! It was important to us that you could start right away, even though the game is not finished. While you're already searching for Hannah, solving puzzles and making decisions, we're working on the sequel. Your feedback is important to us. If you have any suggestions, please email us at support@everbytestudio.com \uD83D\uDE42\uD83D\uDC4D\n" +
                            "\n" +
                            "SOCIAL MEDIA\n" +
                            "https://www.instagram.com/everbytestudio/\n" +
                            "https://www.facebook.com/PlayDuskwood\n" +
                            "https://twitter.com/EverbyteStudio\n" +
                            "\n" +
                            "PERMISSIONS EXPLAINED\n" +
                            "READ_EXTERNAL_STORAGE & WRITE_EXTERNAL_STORAGE permissions are being used to download, store and access game data.\n" +
                            "\n" +
                            "HOW TO PLAY? DECISION GAMES, TEXT ADVENTURES, CYOA?\n" +
                            "You are connected to your friends in Duskwood via chat messenger. Your answers, choices and decisions influence what others reveal of themselves, whether they like you, and even change the course of the story. This type of role play game (rpg) is also called text adventure, cyoa, decision- or choice games. It belongs to the genre of interactive crime fiction.",
                    arrayOf( //Developer Contact
                            "http://everbytestudio.com/",
                            "support@everbytestudio.com",
                            "Laulestraße 31 78120, Furtwangen",
                            ""
                    )
            ),
            arrayOf(
                    40001,
                    "Garena Free Fire - The Cobra",
                    "GARENA INTERNATIONAL I PRIVATE LIMITED",
                    "Game",
                    12,
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
                    "L",
                    "Free Fire is the ultimate survival shooter game available on mobile. Each 10-minute game places you on a remote island where you are pit against 49 other players, all seeking survival. Players freely choose their starting point with their parachute, and aim to stay in the safe zone for as long as possible. Drive vehicles to explore the vast map, hide in wild, or become invisible by proning under grass or rifts. Ambush, snipe, survive, there is only one goal: to survive and answer the call of duty.\n" +
                            "\n" +
                            "[Survival shooter in its original form]\n" +
                            "Search for weapons, stay in the play zone, loot your enemies and become the last man standing. Along the way, go for legendary airdrops while avoiding airstrikes to gain that little edge against other players.\n" +
                            "\n" +
                            "[10 minutes, 50 players, epic survival goodness awaits]\n" +
                            "Fast and Lite gameplay - Within 10 minutes, a new survivor will emerge. Will you go beyond the call of duty and be the one under the shining lite?\n" +
                            "\n" +
                            "[4-man squad, with in-game voice chat]\n" +
                            "Create squads of up to 4 players and establish communication with your squad at the very first moment. Answer the call of duty and lead your friends to victory and be the last team standing at the apex.\n" +
                            "\n" +
                            "[Clash Squad]\n" +
                            "Fast paced 4v4 game mode is now open 24/7! Manage your economy, purchase weapons, and defeat the enemy squad!\n" +
                            "\n" +
                            "[Realistic and smooth graphics]\n" +
                            "Easy to use controls and smooth graphics promises the best survival experience you will find on mobile to help you immortalize your name among the legends.\n" +
                            "\n" +
                            "[Contact us]\n" +
                            "Customer Service: https://goo.gl/8f5918",
                    arrayOf( //Developer Contact
                            "https://ff.garena.com/",
                            "freefire@garena.com",
                            "1 FUSIONOPOLIS PLACE, 17-10, GALAXIS, Singapore",
                            ""
                    )
            ),
            arrayOf(
                    60001,
                    "JOOX: Gratis Musik download, Radio dan Karaoke",
                    "Tencent Mobility Limited",
                    "Music & Audio",
                    3,
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
                    "P",
                    "The JOOX streaming music app is here for download. It’s the FREE music player app with lyrics for all local music lovers to stream or download the latest songs with millions of other local and International tracks to choose from. Listen to your favourite radio stations. Enjoy karaoke and stream videos with friends. Download the JOOX app on your Android mobile device or tablet, that is for true music lovers.\n" +
                            "\n" +
                            "Discover new music with exclusive music playlists from our editors who have selected songs that fit your taste and mood the best, anytime anywhere.\n" +
                            "\n" +
                            "FREE FEATURES\n" +
                            "\n" +
                            "* Huge Library of Music - Instantly access streaming music from across the world.\n" +
                            "\n" +
                            "* JOOX Radio - Access over 50 radio stations with an immense number of songs and hits.\n" +
                            "\n" +
                            "* Recommended Playlists - Whether it’s a playlist recommended by us, with songs to fit your mood.\n" +
                            "\n" +
                            "* Lyrics for all your favourite hits - Learn the words and lyrics to your favourite songs and albums to use in Karaoke\n" +
                            "\n" +
                            "* Personalised Music - Customise your playlists with your favourite songs and tracks for every occasion.\n" +
                            "\n" +
                            "* Real-Time Sharing - Share your songs with friends and on your Moments.\n" +
                            "\n" +
                            "* Live Broadcasting - Get closer to your favourite artist in JOOX Live.\n" +
                            "\n" +
                            "* Music Videos – watch music videos, exclusive interviews and documentaries.\n" +
                            "\n" +
                            "In addition to all the above great FREE features, the JOOX VIP service turns it up for the real music fans:\n" +
                            "\n" +
                            "* Play songs on-demand.\n" +
                            "\n" +
                            "* Download music for offline listening.\n" +
                            "\n" +
                            "* High-quality audio for music streaming.\n" +
                            "\n" +
                            "* No audio ads during songs.\n" +
                            "\n" +
                            "The JOOX app is for whenever your need for music is there to excite and inspire. Listen to songs on a playlist for the long commute, for a party or at work. JOOX has music for everyone whether you are on the go or at home.\n" +
                            "\n" +
                            "Listen to your favourite local and International chart-topping hip-hop, R&B, Pop, Dance, EDM songs and albums. Stream or download your favourite music from other music genres for the best music app experience.\n" +
                            "\n" +
                            "Download the JOOX music player app now!\n" +
                            "\n" +
                            "JOOX User Terms: http://www.joox.com/common_redirect.html?page=terms&target=user_terms\n" +
                            "Privacy Policy and Terms of Service: http://www.tencent.com/en-us/zc/termsofservice.shtml\n" +
                            "\n" +
                            "For any questions, please feel free to contact us at\n" +
                            "Official Website: www.JOOX.com\n" +
                            "Email: feedback@JOOX.com\n",
                    arrayOf( //Developer Contact
                            "https://www.joox.com/id",
                            "support@joox.com",
                            "4/F,Nanxinnanyi Road,Feiyada Building,Nanshan District",
                            ""
                    )
            ),
            arrayOf(
                    20001,
                    "LINE: Free Calls & Messages",
                    "LINE Corporation",
                    "Communication",
                    3,
                    4.1,
                    83.0,
                    3,
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
                    "P",
                    "LINE reshapes communication around the globe, allowing you to enjoy not only messaging but also free voice and video calls wherever you find yourself.\n" +
                            "\n" +
                            "Download LINE and discover the reasons for its global popularity and number one ranking in 52 countries.\n" +
                            "\n" +
                            "LINE's latest features\n" +
                            "\n" +
                            "★ Intimate conversations or large round tables can happen anywhere with group video calls\n" +
                            "Chat with up to 200 friends in your group simultaneously! Enjoy face to face video chats with friends as well!\n" +
                            "\n" +
                            "★ Use polls to quickly see what your friends think\n" +
                            "From where to meet to what to eat, avoid lengthy discussions and make decisions easily by creating a poll.\n" +
                            "\n" +
                            "LINE's main features\n" +
                            "\n" +
                            "★ Free voice and video calls anywhere, anytime\n" +
                            "Enjoy great quality calls at no charge, no matter where you are. Even international calls with up to 200 people at the same time are completely free! Use effects and filters for even more fun during video calls. (Note that this feature may not be available on certain devices.)\n" +
                            "\n" +
                            "★ Convenient chats where anything is possible\n" +
                            "Share messages, photos, videos, stickers, voice messages, and locations easily with friends.\n" +
                            "\n" +
                            "★ Fun and easy-to-use social networking features\n" +
                            "From messages and photos to videos and locations, share your daily moments with friends on Timeline!\n" +
                            "\n" +
                            "★ Find the world's most popular characters at the Sticker Shop\n" +
                            "Browse hundreds of popular free stickers plus adorable stickers of the world's favorite characters! Choose from a variety of LINE sticker sets to liven up your messages in your own unique way.\n" +
                            "\n" +
                            "★ Auto-sync your device and PC\n" +
                            "Whether on the go with the mobile version or connected to the desktop version using your PC or Mac, your LINE chats are always up-to-date and synced automatically across all versions.\n" +
                            "\n" +
                            "★ Your own personal storage space: Keep\n" +
                            "Store messages, photos, videos, and more in Keep where you can easily share them with friends.\n" +
                            "\n" +
                            "★ Stay informed with LINE official accounts\n" +
                            "Connect directly with your favorite celebrities and companies by friending their official accounts.\n" +
                            "\n" +
                            "★ Get connected to new apps\n" +
                            "LINE provides a gateway to entertainment and lifestyle apps that will keep you entertained and bring new convenience to your life.\n" +
                            "\n" +
                            "★ Make international calls with LINE Out\n" +
                            "Place international calls to mobile phones and landlines at low rates. You can even call friends who aren't on LINE.\n" +
                            "Plus, enjoy free calls after watching ads with LINE Out Free.\n" +
                            "\n" +
                            "■ We recommend using a data plan or connecting to Wi-Fi as you may incur data usage fees otherwise.\n" +
                            "■ Please also use LINE with Android OS versions 4.4 and above to enjoy LINE to the fullest extent.\n" +
                            "\n" +
                            "**********\n" +
                            "If your network speed is too slow or you don't have enough device storage, LINE may not install properly.\n" +
                            "\n" +
                            "If this happens, please check your connection and try again.\n" +
                            "**********",
                    arrayOf( //Developer Contact
                            "http://line.me/",
                            "line-support@line.me",
                            "東京都新宿区新宿四丁目1番6号",
                            ""
                    )
            ),
            arrayOf(
                    40002,
                    "My Talking Tom 2",
                    "Outfit7 Limited",
                    "Game",
                    3,
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
                    "P",
                    "From the creators of My Talking Tom comes a new global hit game, My Talking Tom 2!\n" +
                            "In this cool free game, the famous pet cat Tom is going on an amazing life adventure!\n" +
                            "\n" +
                            "THE COOLEST CAT ON THE BLOCK: Talking Tom is funnier and more lively than ever before! He reacts to everything players do and there are new surprises every day!\n" +
                            "\n" +
                            "EVERYDAY FUN: Players can feed Tom when he’s hungry, wash him when he’s dirty, put him to bed when he’s tired, and take him to the toilet when he’s… really got to go! They can watch him grow into a big happy cat!\n" +
                            "\n" +
                            "NEW MINI GAMES: There are brand new mini games to play, including puzzle games, action games, and Tom’s first-ever multiplayer mini game!\n" +
                            "\n" +
                            "EXPLORING NEW WORLDS: Tom’s plane can be used to discover exciting new worlds. Players can go flying and bring back amazing treasures and use them to dress Tom up or decorate his house.\n" +
                            "\n" +
                            "TOM’S PETS: Yes, Tom has a pet too, and there are four more pets to discover! Each one has its own look and personality. Players can try feeding them to see what happens!\n" +
                            "\n" +
                            "PLAY FOR FREE!\n" +
                            "\n" +
                            "My Talking Tom 2 offers users exclusive monthly subscriptions, allowing access to exclusive additional gameplay features, as optional in-app purchases.\n" +
                            "\n" +
                            "Gamer Pack (Gaming monthly subscription) – which offers the option to resume playing 4x per mini-game session and unlimited energy for playing mini-games – is priced at 5.99 per month, with the first-month payment discounted -50% (\$2.99).\n" +
                            "Daily Pack (Tom’s monthly subscription) - which offers daily packages (750 flight tokens, 2 soaps, 3 foods) – is priced at 5.99 per month, with the first-month payment discounted -50% (\$2.99).\n" +
                            "VIP Pack (VIP monthly subscription) - which offers daily packages (750 flight tokens, 2 soaps, 3 foods), an option to resume playing 4x per mini-game and unlimited energy for playing mini-games – is priced at 9.99 per month, with the first-month payment discounted -50% (\$4.99).\n" +
                            "\n" +
                            "Payment will be charged to your Google Play account at the confirmation of purchase. The subscription automatically renews every month unless it is canceled any time before the end of the current subscription period. When you cancel your subscription, the cancellation will apply from the next subscription period onwards. You can manage and cancel your subscriptions by going to your Google Play Account settings after purchase. Please note that deleting the app does not result in cancellation of your subscription.\n" +
                            "\n" +
                            "This app contains:\n" +
                            "- Promotion of Outfit7's products and advertising;\n" +
                            "- Links that direct customers to Outfit7’s websites and other apps;\n" +
                            "- Personalization of content to encourage users to play the app again;\n" +
                            "- YouTube integration to allow users to watch videos of Outfit7's animated characters;\n" +
                            "- The option to make in-app purchases;\n" +
                            "- Items to purchase (available in different prices) using virtual currency, depending on the player’s progress; and\n" +
                            "- Alternative options to access all functionalities of the app without making any in-app purchases using real money.\n" +
                            "\n" +
                            "Please note, we do not process all the data disclosed on the label for users under the age of digital consent. For more information, please check our Privacy Policy.\n" +
                            "\n" +
                            "Terms of use: http://outfit7.com/eula/\n" +
                            "EEA privacy policy: https://outfit7.com/privacy/eea/\n" +
                            "US privacy policy: https://outfit7.com/privacy/\n" +
                            "Rest of the world privacy policy: https://outfit7.com/privacy/\n" +
                            "Customer support: support@outfit7.com",
                    arrayOf( //Developer Contact
                            "https://outfit7.com/game-support/",
                            "support@outfit7.com",
                            "Outfit7 Limited Agiou Georgiou 4607 Pissouri, Cyprus",
                            ""
                    )
            ),
            arrayOf(
                    30002,
                    "Netflix",
                    "Netflix, Inc.",
                    "Entertainment",
                    12,
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
                    "P",
                    "Looking for the most talked about TV shows and movies from the around the world? They’re all on Netflix.\n" +
                            "\n" +
                            "We’ve got award-winning series, movies, documentaries, and stand-up specials. And with the mobile app, you get Netflix while you travel, commute, or just take a break.\n" +
                            "\n" +
                            "What you’ll love about Netflix:\n" +
                            "\n" +
                            "• We add TV shows and movies all the time. Browse new titles or search for your favorites, and stream videos right on your device.\n" +
                            "• The more you watch, the better Netflix gets at recommending TV shows and movies you’ll love.\n" +
                            "• Create up to five profiles for an account. Profiles give different members of your household their own personalized Netflix.\n" +
                            "• Enjoy a safe watching experience just for kids with family-friendly entertainment.\n" +
                            "• Preview quick videos of our series and movies and get notifications for new episodes and releases.\n" +
                            "• Save your data. Download titles to your mobile device and watch offline, wherever you are.\n" +
                            "\n" +
                            "For complete terms and conditions, please visit http://www.netflix.com/termsofuse\n" +
                            "For privacy statement, please visit http://www.netflix.com/privacy\n",
                    arrayOf( //Developer Contact
                            "http://www.netflix.com/",
                            "playstore@netflix.com",
                            "100 Winchester Circle Los Gatos, CA 95032-1815, USA",
                            ""
                    )
            ),
            arrayOf(
                    70002,
                    "PicsArt Photo Editor: Pic, Video & Collage Maker",
                    "PicsArt",
                    "Photography",
                    12,
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
                    "P",
                    "PicsArt is the best all-in-one photo and video editor on mobile! Unleash your creativity with one of the most popular apps with over 1 billion downloads to date. PicsArt gives you everything you need to create awesome edits. The best part? It’s free!\n" +
                            "\n" +
                            "Edit photos and videos, have fun with our sticker maker & collage maker, doodle on photos, and do way more. No professional experience needed!\n" +
                            "\n" +
                            "Awesome Features:\n" +
                            "\n" +
                            "PHOTO EDITOR\n" +
                            "• Try hot filters for pictures & trendy photo effects.\n" +
                            "• Access impressive background eraser: cut out photos & erase backgrounds.\n" +
                            "• Remove objects and get amazing photo retouch.\n" +
                            "• Use millions of outstanding free images or edit your own pictures.\n" +
                            "• Speak your mind: add text to photos using 200+ aesthetic fonts.\n" +
                            "• Get a stunning makeover with Beautify tools: hair color changer, makeup stickers & more.\n" +
                            "• Blur photo backgrounds with a smart selection tool.\n" +
                            "• Create beautiful double exposure edits & blend photo layers.\n" +
                            "• Quickly flip & crop photos.\n" +
                            "\n" +
                            "VIDEO EDITOR\n" +
                            "• Edit videos or make them from scratch using outstanding video maker with music.\n" +
                            "• Bring your exciting stories to life and create exciting TikTok videos.\n" +
                            "• Add music to your videos using a sizzling library of popular songs.\n" +
                            "• Crop video clips or use square fit to add backgrounds then post on your IG for “likes.”\n" +
                            "• Use Glitch video effects. Instantly change it up by adding trendy video filters.\n" +
                            "• Trim videos or use smart video merger to merge videos together.\n" +
                            "• Play around with photo awesome slideshow maker with music.\n" +
                            "• Add your best moments to a video collage & use different ratios.\n" +
                            "\n" +
                            "COLLAGE MAKER\n" +
                            "• Create an amazing photo collage using all your favorite pictures.\n" +
                            "• Try photo grid, freestyle collage, scrapbook, and frames for photos.\n" +
                            "• Choose from a bunch of layout designs.\n" +
                            "• Go viral. Create funny memes with our meme generator & share with friends.\n" +
                            "• Use story maker and level up your Instagram game with story templates.\n" +
                            "\n" +
                            "STICKER MAKER + FREE STICKERS\n" +
                            "• Discover over 60+ million cool PicsArt stickers for iMessage.\n" +
                            "• Add stickers to photos to turn up the fun level on edits.\n" +
                            "• Make your own cute clipart & use cut out tool to create funny custom stickers.\n" +
                            "\n" +
                            "PHOTO EFFECTS\n" +
                            "• Outline selfies with the hottest Sketch effects.\n" +
                            "• Turn portraits into artistic masterpieces with Canvas effects.\n" +
                            "• Create trending Drip Art. Use dripping effect stickers & customize the blend mode.\n" +
                            "• Cartoon yourself with amazing Magic effects to turn photos into cartoons.\n" +
                            "• Play with cool Doodle Art & start doodling away for hours.\n" +
                            "\n" +
                            "DRAWING TOOL\n" +
                            "• Use PicsArt Draw with cool customizable brushes, layers, & pro drawing tools.\n" +
                            "• Doodle on pictures whenever you’re bored & get a transparent clothes effect.\n" +
                            "• Create art & illustrations from scratch or just draw something inspiring for fun.\n" +
                            "\n" +
                            "REPLAY\n" +
                            "• Recreate trending edits in a few taps. Cut editing time in half with easy customizable steps.\n" +
                            "• Edit multiple photos in the same style. Keep your Instagram feed on-trend & consistent by creating personal presets.\n" +
                            "\n" +
                            "\uD83D\uDC51 PICSART GOLD\n" +
                            "• Go Gold! PicsArt’s Gold subscription grants access to NEW EXCLUSIVE content all the time. All the hottest features with ad-free editing experience.\n" +
                            "---\n" +
                            "Start your PicsArt Gold membership with a free trial - limited to one per Google Play account. Once the trial is over, you’ll be charged a nominal subscription fee. Your Gold subscription will automatically renew unless auto-renew is turned off at least 24 hours before the end of the current period. If your subscription is subject to any promotional discount, the discount will expire upon the end of the current period & you’ll be charged the standard rate upon renewal. Go to your Google Play account to manage your membership & to turn auto-renew off. Your Google Play account will be charged when the purchase is confirmed.\n" +
                            "\n" +
                            "Terms and conditions: https://picsart.com/terms-and-conditions\n" +
                            "About Ads: https://picsart.com/privacy-policy#interest-base",
                    arrayOf( //Developer Contact
                            "https://picsart.com/",
                            "support@picsart.com",
                            "PicsArt Inc. One Market Street, Spear Tower, Floor 32 San Francisco, 94105, CA",
                            ""
                    )
            ),
            arrayOf(
                    50001,
                    "Pinterest - jutaan inspirasi dan ide kreatif",
                    "Pinterest",
                    "Lifestyle",
                    12,
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
                    "P",
                    "Looking for creative ideas? Whether you’re planning your next big travel adventure, searching for home design concepts, looking for fashion & fitness tips or checking out new recipes, explore lifestyle inspiration on Pinterest. Good ideas start here!\n" +
                            "\n" +
                            "Discover billions of possibilities for every part of your life, from new recipes to creative home design ideas. Create extra home storage space, find your new favorite recipe, or get tattoo inspiration on Pinterest.\n" +
                            "\n" +
                            "Save ideas on Pinterest:\n" +
                            "★ Find lifestyle inspiration & explore articles on trending and recommended topics\n" +
                            "\n" +
                            "★ Collaborate with friends for your next group trip, party or DIY project\n" +
                            "\n" +
                            "★ See ideas & images out in the world that you like and snap a photo with Pinterest Lens to find out how to buy/make/do them!\n" +
                            "\n" +
                            "Discover wedding tips, beauty inspiration and design concepts for your big day. Explore thousands of recommended or trending images, get travel inspiration or read new recipes and creative food ideas for your next dinner party. With fitness tips, interesting DIY projects to try out and tons of great fashion, style & beauty tips, Pinterest keeps all of your lifestyle inspiration in one place.\n" +
                            "\n" +
                            "You never know what sparks a great design idea or when inspiration for your next DIY project might strike.\n" +
                            "\n" +
                            "Get inspired from anywhere on the internet. Save your ideas, organize them by topic and share with others – all from your pocket!\n" +
                            "\n" +
                            "Get ideas for the topics you care about most:\n" +
                            "- Home design, architecture & DIY\n" +
                            "- Creative wedding tips\n" +
                            "- Travel, fitness & beauty\n" +
                            "- Fashion and style inspiration\n" +
                            "- Food, new recipes & cooking\n" +
                            "\n" +
                            "To start saving and sharing Pins, download now.\n",
                    arrayOf( //Developer Contact
                            "https://help.pinterest.com/en",
                            "help@pinterest.com",
                            "",
                            ""
                    )
            ),
            arrayOf(
                    40005,
                    "PUBG MOBILE - DREAM TEAM",
                    "Tencent Games",
                    "Game",
                    16,
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
                    "L",
                    "The official PLAYERUNKNOWN'S BATTLEGROUNDS designed exclusively for mobile. Play free anywhere, anytime. PUBG MOBILE delivers the most intense free-to-play multiplayer action on mobile. Drop in, gear up, and compete. Survive epic 100-player classic battles, payload mode and fast-paced 4v4 team deathmatch and zombie modes. Survival is key and the last one standing wins. When duty calls, fire at will!\n" +
                            "\n" +
                            "FREE ON MOBILE - Powered by the Unreal Engine 4. Play console quality gaming on the go. Delivers jaw-dropping HD graphics and 3D sound. Featuring customizable mobile controls, training modes, and voice chat. Experience the most smooth control and realistic ballistics, weapon behavior on mobile.\n" +
                            "\n" +
                            "MASSIVE BATTLE MAPS - From Erangel to Miramar, Vikendi to Sanhok, compete on these enormous and detailed battlegrounds varying in size, terrain, day/night cycles and dynamic weather – from urban city spaces to frozen tundra, to dense jungles, master each battleground's secrets to create your own strategic approach to win.\n" +
                            "\n" +
                            "DEPTH AND VARIETY – From the 100-player classic mode, the exhilarating payload mode to the lightning-fast Arcade and 4v4 Team Deathmatch modes, as well as the intense Zombie modes. There is something for everyone! There is something for everyone. Play Solo, Duo, and in 4-player Squads. Fire your weapon to your heart's content! Be a lone wolf soldier or play with a Clan and answer the duty calls when help is needed! Offers FPS (First-Person Shooter) and TPS (Third-Person Shooter) play, lots of vehicles for all the different terrains in the game and an arsenal of realistic weapons. Find your perfect ride and pieces to cruise towards the final circle!\n" +
                            "\n" +
                            "ALWAYS GROWING - Daily events & challenges, and monthly updates delivering new gameplay features and modes that keep PUBG MOBILE always growing and expanding. Our powerful and serious anti-cheating mechanisms ensure a fair and balanced gaming environment where everyone plays by the rules.\n" +
                            "\n" +
                            "* Requires a stable internet connection.\n" +
                            "* PUBG MOBILE recommended system requirements: Android 5.1.1 or above and at least 2 GB memory. For other devices can try out PUBG MOBILE LITE\n" +
                            "\n" +
                            "Follow us:\n" +
                            "Facebook: https://www.facebook.com/PUBGMOBILE\n" +
                            "Twitter: https://twitter.com/PUBGMobile\n" +
                            "Reddit: https://www.reddit.com/r/PUBGMobile/\n" +
                            "Discord：https://discord.gg/pubgm\n" +
                            "\n" +
                            "Contact our customer service at PUBGMOBILE_CS@tencentgames.com if you have any questions.",
                    arrayOf( //Developer Contact
                            "https://www.pubgmobile.com/en-US/",
                            "PUBGMOBILE_CS@tencentgames.com",
                            "10 ANSON ROAD #21-07 INTERNATIONAL PLAZA SINGAPORE (079903)",
                            ""
                    )
            ),
            arrayOf(
                    60002,
                    "Spotify",
                    "Spotify Ltd.",
                    "Music & Audio",
                    12,
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
                        "https://play-lh.googleusercontent.com/dZC2vJgTOyTV6iK6U_MxrrvGynvXEDeo4mpZGzuoUGlMue2QhB3vtKDbFfILa7KYCw=w720-h310-rw",
                    ),
                    "P",
                    "With Spotify, you can listen to music and play millions of songs and podcasts for free. Stream music and podcasts you love and find music - or your next favorite song - from all over the world.\n" +
                            "\n" +
                            "• Discover new music, albums, playlists and podcasts\n" +
                            "• Search for your favorite song, artist, or podcast\n" +
                            "• Enjoy music playlists and an unique daily mix made just for you\n" +
                            "• Make and share your own playlists\n" +
                            "• Explore the top songs from different genres, places, and decades\n" +
                            "• Find music playlists for any mood and activity\n" +
                            "• Listen to music and more on your mobile, tablet, desktop, PlayStation, Chromecast, TV, and speakers\n" +
                            "\n" +
                            "Play podcasts and music for free on your mobile and tablet with Spotify. Download albums, playlists, or just that one song and listen to music offline, wherever you are.\n" +
                            "\n" +
                            "With Spotify, you have access to a world of free music, curated playlists, artists, and podcasts you love. Discover new music, podcasts, top songs or listen to your favorite artists, albums. Create your own music playlists with the latest songs to suit your mood.\n" +
                            "\n" +
                            "Spotify makes streaming music easy with curated playlists and thousands of podcasts you can’t find anywhere else. Find music from new artists, stream your favorite album or playlist and listen to music you love for free.\n" +
                            "\n" +
                            "• Free music and podcasts made easy – Listen to a playlist, album, or the top songs from any genre on shuffle mode.\n" +
                            "\n" +
                            "Listen to music and podcasts on your tablet for free\n" +
                            "• Play any song, artist, podcast, album, or playlist and enjoy a personalised music experience with a daily mix to match your taste.\n" +
                            "\n" +
                            "Spotify Premium features\n" +
                            "• Listen to an album, playlist, or podcast without ad breaks. With Spotify you can play music by any artist, at any time on any device--mobile, tablet, or your computer.\n" +
                            "• Download to listen to music offline, wherever you are.\n" +
                            "• Jump back in and listen to your top songs.\n" +
                            "• Enjoy amazing sound quality on personalized music and podcasts.\n" +
                            "• Discover new music, a daily mix or curated playlists that suit your mood. With Spotify you’ll get a personalized music experience like no other.\n" +
                            "• No commitment - cancel any time you like.\n" +
                            "\n" +
                            "Want to discover new music?\n" +
                            "Find music that you’ll love today! Explore our curated music playlists, top songs and albums, or get personalized music recommendations with your daily mix.\n" +
                            "\n" +
                            "Love Spotify?\n" +
                            "Like us on Facebook: http://www.facebook.com/spotify\n" +
                            "Follow us on Twitter: http://twitter.com/spotify\n" +
                            "\n" +
                            "Please note: This app features Nielsen’s audience measurement software which will allow you to contribute to market research, such as Nielsen’s Audio Measurement. If you don't want to participate, you can opt-out within the app settings. To learn more about our digital audience measurement products and your choices in regard to them, please visit http://www.nielsen.com/digitalprivacy for more information.",
                    arrayOf( //Developer Contact
                            "https://www.spotify.com/id/",
                            "android-support@spotify.com",
                            "Spotify Ltd c/o Goodwille Ltd St James House 13 Kensington Square London W8 5HD Great Britain",
                            ""
                    )
            ),
            arrayOf(
                    40004,
                    "Tiny Room Stories: Town Mystery",
                    "Kiary games",
                    "Game",
                    7,
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
                    "L",
                    "You are a private detective. After receiving a letter from your father, asking for help, you go to the small town of Redcliff.\n" +
                            "The city is completely empty. Where have all the inhabitants gone? What happened to your father?\n" +
                            "This is what you have to find out. Explore the city, find clues, solve puzzles, open locks to advance your investigation. The game is a mixture of escape the room and classic quests.\n" +
                            "\n" +
                            "Features:\n" +
                            "- Fully 3D levels that can and should be rotated to inspect them from another angle.\n" +
                            "- Variety of locations from the usual residential building to the ancient catacombs.\n" +
                            "- Interactive world\n" +
                            "- Many puzzles\n" +
                            "- Detective story, with unexpected plot twists.\n" +
                            "\n" +
                            "Awards:\n" +
                            "Best Indie Game - Google Play 2019\n" +
                            "Best Mobile Game - Indie Prize Award\n" +
                            "Best Mobile Game - DevGAMM’2019\n" +
                            "Best Mobile Game - GTP Indie Cup W'19\n" +
                            "TOP 20 - Indie Games Showcase from Google Play\n" +
                            "Best Indie Game (Nominee) - DevGAMM’2019\n" +
                            "Excellence in Game Design (Nominee) - DevGAMM’2019",
                    arrayOf( //Developer Contact
                            "https://kiarygames.com/",
                            "feedback@kiarygames.com",
                            "Russian Federation, 660098 Krasnoyarski krai, Krasnoyarsk, Alekseeva 22-490",
                            ""
                    )
            ),
            arrayOf(
                    80002,
                    "TikTok",
                    "TikTok Pte. Ltd.",
                    "Video Players & Editors",
                    12,
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
                    "P",
                    "TikTok is THE destination for mobile videos. On TikTok, short-form videos are exciting, spontaneous, and genuine. Whether you’re a sports fanatic, a pet enthusiast, or just looking for a laugh, there’s something for everyone on TikTok. All you have to do is watch, engage with what you like, skip what you don’t, and you’ll find an endless stream of short videos that feel personalized just for you. From your morning coffee to your afternoon errands, TikTok has the videos that are guaranteed to make your day.\n" +
                            "\n" +
                            "We make it easy for you to discover and create your own original videos by providing easy-to-use tools to view and capture your daily moments. Take your videos to the next level with special effects, filters, music, and more.\n" +
                            "\n" +
                            "■ Watch endless amount of videos customized specifically for you\n" +
                            "A personalized video feed based on what you watch, like, and share. TikTok offers you real, interesting, and fun videos that will make your day.\n" +
                            "\n" +
                            "■ Explore videos, just one scroll away\n" +
                            "Watch all types of videos, from Comedy, Gaming, DIY, Food, Sports, Memes, and Pets, to Oddly Satisfying, ASMR, and everything in between.\n" +
                            "\n" +
                            "■ Pause recording multiple times in one video\n" +
                            "Pause and resume your video with just a tap. Shoot as many times as you need.\n" +
                            "\n" +
                            "■ Be entertained and inspired by a global community of creators\n" +
                            "Millions of creators are on TikTok showcasing their incredible skills and everyday life. Let yourself be inspired.\n" +
                            "\n" +
                            "■ Add your favorite music or sound to your videos for free\n" +
                            "Easily edit your videos with millions of free music clips and sounds. We curate music and sound playlists for you with the hottest tracks in every genre, including Hip Hop, Edm, Pop, Rock, Rap, and Country, and the most viral original sounds.\n" +
                            "\n" +
                            "■ Express yourself with creative effects\n" +
                            "Unlock tons of filters, effects, and AR objects to take your videos to the next level.\n" +
                            "\n" +
                            "■ Edit your own videos\n" +
                            "Our integrated editing tools allow you to easily trim, cut, merge and duplicate video clips without leaving the app.\n" +
                            "\n" +
                            "* Any feedback? Contact us at https://www.tiktok.com/legal/report/feedback or tweet us @tiktok_us\n",
                    arrayOf( //Developer Contact
                            "https://www.tiktok.com/",
                            "feedback@tiktok.com",
                            "201 Henderson Road, #06-22 Apex@Henderson, Singapore 159545",
                            ""
                    )
            ),
            arrayOf(
                    50002,
                    "Tinder - Match. Ngobrol. Bertemu.",
                    "Tinder",
                    "Lifestyle",
                    18,
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
                    "P",
                    "\uD83D\uDD25You can be here for a good time, and a long time, too.\uD83D\uDD25\n" +
                            "\n" +
                            "With 30 billion matches to date, Tinder® is the\uD83D\uDD1D top dating app\uD83D\uDD1D, making it the place to be to meet new people. Whether you’re looking for love, need a date today, or just want to chat: We’ve got something for local singles everywhere and features that give you the best dating experience possible. Like what? Glad you asked\uD83D\uDE09\n" +
                            "\n" +
                            "Whether you’re gay or bisexual, be proud of who you are with our Orientation feature\uD83C\uDFF3️\u200D\uD83C\uDF08\uD83C\uDFF3️\u200D⚧️\n" +
                            "Find out what you’ve got in common with your potential match with Interests\uD83E\uDD1D\n" +
                            "Bring a plus one on all your dates for extra safety with Noonlight\uD83D\uDEE1️\n" +
                            "\n" +
                            "Take us with you on your travels and get to know the locals — wherever you go, we’ll be there. Some people call us their “most dependable matchmaker”, some people call us \uD83D\uDD25the world’s most popular free dating app\uD83D\uDD25, but you can just call us when you want to meet up with people in your area.\n" +
                            "\n" +
                            "\uD83E\uDD42While you’re here — make a toast to the Gold life and enjoy all of Tinder’s premium features with our top-tier subscription\uD83E\uDD42\n" +
                            "\n" +
                            "Likes You allows you to see all your fans, saving you precious time\uD83D\uDD70️\n" +
                            "Unlimited Likes for you to catch feelings for as many people as you want\uD83D\uDC9A\n" +
                            "Rewind for you to undo your last Like or Nope⏪\n" +
                            "Use Passporttm to go anywhere in the world to find people online outside your zip code✈️\n" +
                            "Boost your profile to the top for thirty minutes to get more attention⚡\n" +
                            "5 Super Likes per day because sometimes you really, really Like someone\uD83D\uDC9D\n" +
                            "\n" +
                            "There’s a plus side for those not ready to commit to a relationship with \uD83D\uDC9BGold \uD83D\uDC9B. With Tinder Plus®, you’ll unlock features including Unlimited Likes, Passport, Rewind, Boost, and 5 Super Likes per day.\n" +
                            "\n" +
                            "Match. Chat. Date. That’s our mantra. It’s easy and fun to find people on Tinder. Make your profile stand out with your best pics and a little something about you to increase your match making potential. Use the \uD83D\uDC49Swipe Right™\uD83D\uDC49 feature to Like someone, use the \uD83D\uDC48Swipe Left™\uD83D\uDC48 feature to pass. If someone Likes you back, It’s a Match! And, there’s no pressure: We created the double opt-in which means two people have to show a mutual interest in order for there to be a match. How many dating apps can say that?\uD83E\uDD14\n" +
                            "\n" +
                            "Tinder is the biggest and flyest party in the world for singles — it’s about time you showed up.\uD83C\uDF7E\n" +
                            "\n" +
                            "-----------------------------------\n" +
                            "\n" +
                            "If you choose to purchase Tinder Plus or Tinder Gold, payment will be charged to your Google Play account, and your account will be charged for renewal within 24-hours prior to the end of the current period. Auto-renewal may be turned off at any time by going to your settings in the Play Store after purchase. Current Tinder Plus subscription price starts at \$9.99 USD/month, and one-month, 6-month and 12-month packages are available. Current Tinder Gold subscription price starts at \$14.99 USD/month, and one-month, 6-month and 12-month packages are available. Prices are in U.S. dollars, may vary in countries other than the U.S. and are subject to change without notice. No cancellation of the current subscription is allowed during the active subscription period. If you don’t choose to purchase Tinder Plus or Tinder Gold, you can simply continue using Tinder for free.\n" +
                            "\n" +
                            "All photos are of models and used for illustrative purposes only.\n" +
                            "\n" +
                            "Privacy: https://www.gotinder.com/privacy\n" +
                            "Terms: https://www.gotinder.com/terms\n",
                    arrayOf( //Developer Contact
                            "https://tinder.com/",
                            "help@gotinder.com",
                            "Tinder 8833 W. Sunset Blvd. West Hollywood, CA 90069",
                            ""
                    )
            ),
            arrayOf(
                    30003,
                    "Twitch: Livestream Multiplayer Games & Esports",
                    "Twitch Interactive, Inc.",
                    "Entertainment",
                    12,
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
                    "P",
                    "Watch livestream gaming videos, Esports and any IRL broadcast on your Android device! Stream your favorite MMO RPG, strategy and FPS games for PS4, PC, Xbox One and Nintendo Switch. Twitch gives you live streaming and gamer chat in the palm of your hand.\n" +
                            "\n" +
                            "Live chat as you watch gamers play everything from Overwatch to League of Legends. Watch PUBG showdowns, Minecraft sessions, Hearthstone matchups and stunning FIFA 18 goals. Multiplayer games not your thing? Livestream any IRL content you can think of, from art demos to animal videos!\n" +
                            "\n" +
                            "Twitch Live Streaming and Gamer Chat: TOP 3 FEATURES\n" +
                            "1. Watch gamers play Minecraft, Fortnite, PUBG, FIFA 18, League of Legends and much more. Stream content from the biggest MMO RPG, MOBA, strategy and FPS games out there, or settle in for nail-biting Esports tournaments.\n" +
                            "2. Live chat during any gaming, Esports and IRL broadcast. Talk Hearthstone strategy with fellow gamers or content yourself with live streaming art demos in silence.\n" +
                            "3. Broadcast your very own gaming content! Livestream your Overwatch killstreak on Xbox One, build Minecraft monoliths on Nintendo Switch, take down your Fortnite enemies on PS4, or show off your Hearthstone cards on PC!\n" +
                            "\n" +
                            "Twitch lets you watch gamers play any single or multiplayer games under the sun. With PUBG, FIFA 18, League of Legends, Overwatch and Fortnite videos on demand, you can really let your gaming flag fly. Join live chat to connect with your MOBA or MMO RPG community!\n" +
                            "+ Stream interactive live news videos with exclusive content for PS4, Xbox One, Nintendo Switch and PC.\n" +
                            "+ Watch unique programming: livestream anything from art demos, to Esports events, to music festivals!\n" +
                            "+ Discover new multiplayer games and IRL videos with ease thanks to simple and intuitive navigation.\n" +
                            "+ Switch to Dark Mode for those late night viewing and gamer chat sessions.\n" +
                            "\n" +
                            "Join the millions of hardcore and casual gamers who have found a place to connect over the MOBA or FPS games they love. Take your passion to the next level with Twitch!\n" +
                            "\n" +
                            "------\n" +
                            "\n" +
                            "For feedback and assistance, please visit our Support Center: https://help.twitch.tv\n" +
                            "\n" +
                            "Please note: This app features Nielsen’s proprietary measurement software which contributes to market research, like Nielsen’s TV Ratings. Please see http://priv-policy.imrworldwide.com/priv/mobile/us/en/optout.html for more information\n",
                    arrayOf( //Developer Contact
                            "https://www.twitch.tv/",
                            "android@twitch.tv",
                            "350 Bush St Suite 200 San Francisco, CA 94104",
                            ""
                    )
            ),
            arrayOf(
                    30004,
                    "Viu - Drama Korea & Asia Terbaru, Sub Indo",
                    "Vuclip Mobile Video",
                    "Entertainment",
                    12,
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
                    "P",
                    "Viu is the best Drama & Movie app for Indonesians, Malaysians, Burmese and audiences in the Middle East and South Africa!\n" +
                            "\n" +
                            "You can stream & download your favourite shows, movies, TV series and music in full HD with Viu! Watch all of this with subtitles in English, Bahasa Indonesia, Bahasa Malaysia, Burmese, Mandarin & Arabic!\n" +
                            "\n" +
                            "Viu gives you instant access to all your favourite dramas, comedies, horror and more! Watch hit TV shows from Korea, Japan, China, Thailand, Indonesia, Malaysia, Myanmar, Turkey, the Middle East and India as well as our own Viu Originals.\n" +
                            "\n" +
                            "Here’s what you get with Viu:\n" +
                            "Watch Korean Dramas, Korean Movies, TV shows, Thai, Bollywood, Arabic, Pinoy Shows, Myanmar Movie and Shows, Viu Original shows, music and more anytime, anywhere.\n" +
                            "Stream and even download for FREE!\n" +
                            "Watch and enjoy amazing new videos with a curated discovery feed and personal recommendations from Viu\n" +
                            "Watch shows from multiple genres to in HD with subtitles on VIU:\n" +
                            "Drama\n" +
                            "Action\n" +
                            "Horror\n" +
                            "Comedy\n" +
                            "Romance\n" +
                            "Thriller\n" +
                            "Sports\n" +
                            "Variety\n" +
                            "Anime\n" +
                            "\n" +
                            "Fan of a celebrity? Watch every show that they’ve been on! Watch hit shows from celebrities like:\n" +
                            "Lee Min Ho\n" +
                            "Hyun Bin\n" +
                            "Cha Eun Woo\n" +
                            "Park Shin Ye\n" +
                            "Park Min Young\n" +
                            "Song Hye Kyo\n" +
                            "Park Bo Gum\n" +
                            "Kim Soo Hyun\n" +
                            "Ji Chang Wook\n" +
                            "Park Seo Joon\n" +
                            "IU\n" +
                            "\n" +
                            "Keep up to date and get notified when the latest episodes are right when they’re released!\n" +
                            "\n" +
                            "Don’t Miss out on our latest releases:\n" +
                            "From Korea: River Where The Moon Rises, True Beauty, Mr. Queen, The Penthouse, Running Man & more\n" +
                            "From Indonesia: Pretty Little Liars, Dua Garis Biru\n" +
                            "From Malaysia: Isteri Misteri, Keluarga Baha Don Season 2\n" +
                            "From the Middle East: Wadi Al Jinn, Ansaf Majaneen, Al Hedeya, We Neheb Tani Leh, Al Feel Al Azrak 2\n" +
                            "From Myanmar: Tout Cha Lite Mal, Naagin\n" +
                            "From The Philippines: Bakit Manipis Ang Ulap, Ang Panday , Dilim\n" +
                            "From South Africa: Uzalo, Generations the Legacy, Umbewu: The Seed\n" +
                            "Popular anime: Attack on Titan Final Season, Demon Slayer, Detective Conan\n" +
                            "\n" +
                            "Enjoy timeless classics:\n" +
                            "From Korea: Descendants of the Sun, What's Wrong with Secretary Kim, Moon Lovers: Scarlet Heart Ryeo, Hotel del Luna\n" +
                            "From the Middle East: Bebo W Besheer, Khareg 3an Al Qanon, Sahar Al Layaly/Samy Oxeed El Carbon\n" +
                            "Pinoy TV Series & Movies: Babaeng Hampaslupa, Shake Rattle and Roll XV, Ako Legal Wife: Mano Po 4\n" +
                            "Users in Myanmar can enjoy best of TV Shows and Movies from across Asia:\n" +
                            "I'm Fine Thank You Love You, ATM,Pee Mak, Lar Htar Arr Bwar, Nga Pway, Choke Say,Own Nout Nat Loat Sar Mel, Bar Me Ton, Academy Shot, Tha Gaung Yan, Shwe Min Tha Mee Nat Taw Thar Ko Ko, Chit Thu Lu Soe, Nwe Ko Maunt Tote Saung Lot Paypar, Thit Sar Kyo, Pa Sat See Thu Myarr, Achit Ka Thint Ar Pusar Khe Thaw, Andayal Shi The\n" +
                            "and works of their favorite stars like:\n" +
                            "Nay Toe, Pyay Ti Oo, Myint Myat, Aung Ye Lin, Wut Hmone Shwe Yii, Phway Phway, Director Yin Rain, Dway, Shwe Hmone Yati, Thinzar Wint Kyaw, Lu Min, Soe Myat Nandar, Thet Mon Myint, Yan Aung, Eaindra Kyaw Zin, Soe Myat Thuzar\n" +
                            "\n" +
                            "Viu is the Movie player you’re looking for with the options you’ll love\n" +
                            "Movie subtitles in English, Bahasa Malaysia, Bahasa Indonesia, Burmese, Thai, Mandarin & Arabic\n" +
                            "Pause and resume right where you left off\n" +
                            "Watch videos on your laptop, phone or tablet from the same account\n" +
                            "Connect with your friends and share your favorites on social media\n" +
                            "Download videos for offline viewing\n" +
                            "Download free videos\n" +
                            "Download and view movies and music videos anytime, anywhere you want\n" +
                            "Downloader offers both HD and SD quality options\n" +
                            "\n" +
                            "Lights! Camera! Action! Viu has the movies, the stars and the fans all in one place.\n" +
                            "\n" +
                            "Note: The app will collect your Phone Number for the payment option. The app also requires READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions.\n" +
                            "\n" +
                            "We are awaiting your queries and suggestions on help.viu@vuclip.com\n" +
                            "\n" +
                            "Go ahead and visit us on www.viu.com\n" +
                            "\n" +
                            "NOTE: Data charges are applicable as per your internet/mobile operator when you stream videos on the app. If you are viewing downloaded content, no data charges apply.",
                    arrayOf( //Developer Contact
                            "https://www.vuclip.com/",
                            "help.viu@vuclip.com",
                            "Vuclip 1551 McCarthy Boulevard, Suite 213 Milpitas,CA 95035",
                            "Phone: +1.408.649.2240 " +
                                    "\n"+
                                    "Fax: +1.408.649.2245"
                    )
            ),
            arrayOf(
                    20002,
                    "WhatsApp Messenger",
                    "WhatsApp LLC",
                    "Communication",
                    3,
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
                    "P",
                    "WhatsApp from Facebook\n" +
                            "\n" +
                            "WhatsApp Messenger is a FREE messaging app available for Android and other smartphones. WhatsApp uses your phone's Internet connection (4G/3G/2G/EDGE or Wi-Fi, as available) to let you message and call friends and family. Switch from SMS to WhatsApp to send and receive messages, calls, photos, videos, documents, and Voice Messages.\n" +
                            "\n" +
                            "WHY USE WHATSAPP:\n" +
                            "\n" +
                            "• NO FEES: WhatsApp uses your phone's Internet connection (4G/3G/2G/EDGE or Wi-Fi, as available) to let you message and call friends and family, so you don't have to pay for every message or call.* There are no subscription fees to use WhatsApp.\n" +
                            "\n" +
                            "• MULTIMEDIA: Send and receive photos, videos, documents, and Voice Messages.\n" +
                            "\n" +
                            "• FREE CALLS: Call your friends and family for free with WhatsApp Calling, even if they're in another country.* WhatsApp calls use your phone's Internet connection rather than your cellular plan's voice minutes. (Note: Data charges may apply. Contact your provider for details. Also, you can't access 911 and other emergency service numbers through WhatsApp).\n" +
                            "\n" +
                            "• GROUP CHAT: Enjoy group chats with your contacts so you can easily stay in touch with your friends or family.\n" +
                            "\n" +
                            "• WHATSAPP WEB: You can also send and receive WhatsApp messages right from your computer's browser.\n" +
                            "\n" +
                            "• NO INTERNATIONAL CHARGES: There's no extra charge to send WhatsApp messages internationally. Chat with your friends around the world and avoid international SMS charges.*\n" +
                            "\n" +
                            "• SAY NO TO USERNAMES AND PINS: Why bother having to remember yet another username or PIN? WhatsApp works with your phone number, just like SMS, and integrates seamlessly with your phone's existing address book.\n" +
                            "\n" +
                            "• ALWAYS LOGGED IN: With WhatsApp, you're always logged in so you don't miss messages. No more confusion about whether you're logged in or logged out.\n" +
                            "\n" +
                            "• QUICKLY CONNECT WITH YOUR CONTACTS: Your address book is used to quickly and easily connect you with your contacts who have WhatsApp so there's no need to add hard-to-remember usernames.\n" +
                            "\n" +
                            "• OFFLINE MESSAGES: Even if you miss your notifications or turn off your phone, WhatsApp will save your recent messages until the next time you use the app.\n" +
                            "\n" +
                            "• AND MUCH MORE: Share your location, exchange contacts, set custom wallpapers and notification sounds, broadcast messages to multiple contacts at once, and more!\n" +
                            "\n" +
                            "*Data charges may apply. Contact your provider for details.",
                    arrayOf( //Developer Contact
                            "https://www.whatsapp.com/",
                            "android@support.whatsapp.com",
                            "1601 Willow Road Menlo Park, CA 94025",
                            "",
                    )
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
                app.appRate = data[4].toString().toInt()
                app.ratting = data[5].toString().toDouble()
                app.appSize = data[6].toString().toDouble()
                app.appLogo = data[7].toString()
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
                app.appRate = data[4].toString().toInt()
                app.ratting = data[5].toString().toDouble()
                app.appSize = data[6].toString().toDouble()
                app.appLogo = data[7].toString()
                app.appBgDetail = data[8].toString()
                app.arrayDetailBanner = data[9] as Array<String>
                app.detailBannerType = data[10].toString()
                app.appDesc = data[11].toString()
                app.arrayDeveloperContact = data[12] as Array<String>
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
            array_of_apps.forEachIndexed{ index, data -> sortedAppRating.put(index, data[5].toString().toDouble()) }

            //sorted data ratting (Best Ratting -> Worse Ratting)
            val temp = sortedAppRating.toList().sortedByDescending { (_, value) -> value}.toMap()
            //get all sorted index
            val arrayDataIndex = temp.keys.toList()

            for (i in 0..9) {
                val app = App()
                app.appID = array_of_apps[arrayDataIndex[i]][0].toString().toInt()
                app.appName = array_of_apps[arrayDataIndex[i]][1].toString()
                app.appSize = array_of_apps[arrayDataIndex[i]][6].toString().toDouble()
                app.appLogo = array_of_apps[arrayDataIndex[i]][7].toString()
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
                app.appSize = data[6].toString().toDouble()
                app.appLogo = data[7].toString()
                list.add(app)
            }
        }
        return list
    }

}