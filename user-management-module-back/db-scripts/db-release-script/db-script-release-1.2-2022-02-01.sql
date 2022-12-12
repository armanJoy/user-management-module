CREATE TABLE DXRADMIN.language_competency (
	language_competency_id VARCHAR(255),
	language_json VARCHAR(32000),
	backend_date VARCHAR(255),
    frontend_date VARCHAR(255),
	PRIMARY KEY (language_competency_id)
); 


INSERT INTO DXRADMIN.language_competency VALUES(
    'languagecompetencyid001',
    '[
        {
            "componentCode": "appRoot",
            "componentName": "Index Page",
            "labels": [
                {
                    "key": "primaryMenuHead",
                    "eng": "DX-R",
                    "jpn": "DX-R"
                },
                {
                    "key": "login",
                    "eng": "Login",
                    "jpn": "ログイン"
                },
                {
                    "key": "logout",
                    "eng": "Log Out",
                    "jpn": "ログアウト"
                },
                {
                    "key": "companyUsingItTabHead",
                    "eng": "Company using it",
                    "jpn": "運営会社"
                },
                {
                    "key": "termsofUseTabHead",
                    "eng": "Terms of use",
                    "jpn": "利用規約"
                },
                {
                    "key": "privacyPolicyTabHead",
                    "eng": "Privacy Policy",
                    "jpn": "プライバシーポリシー"
                }
            ],
            "messages": [
                {
                    "key": "welcome message",
                    "eng": "Welcome",
                    "jpn": "いらっしゃいませ"
                }
            ],
            "notifications": []
        },
        {
            "componentCode": "system-admin",
            "componentName": "System Admin Parent",
            "labels": [
                {
                    "key": "secondaryMenuHead",
                    "eng": "System Admin",
                    "jpn": "システム管理者"
                }
            ],
            "messages": [
                {
                    "key": "welcomemessage",
                    "eng": "Welcome",
                    "jpn": "いらっしゃいませ"
                }
            ],
            "notifications": []
        },
        {
            "componentCode": "faq-visitor",
            "componentName": "FAQ Visitor Parent",
            "labels": [
                {
                    "key": "pageHeader",
                    "eng": "FAQ",
                    "jpn": "よくある質問"
                },
                {
                    "key": "faqTypeMenu",
                    "eng": "FAQ Type",
                    "jpn": "分類(カテゴリ)"
                },
                {
                    "key": "adminButton",
                    "eng": "Admin",
                    "jpn": "よある問 リト"
                },
                {
                    "key": "wasteTypeLabel",
                    "eng": "Type",
                    "jpn": "よ質問 リスト"
                },
                {
                    "key": "faqCatTabHeader",
                    "eng": "Category",
                    "jpn": "分類(カテゴリ)"
                },
                {
                    "key": "faqQnATabHeader",
                    "eng": "Questions & Answers",
                    "jpn": "質問と回答"
                }
            ],
            "messages": [
                {
                    "key": "welcome message",
                    "eng": "Welcome",
                    "jpn": "いらっしゃいませ"
                }
            ],
            "notifications": []
        },
        {
            "componentCode": "faq-category",
            "componentName": "FAQ Category Tab",
            "labels": [
                {
                    "key": "faqTypeListHeader",
                    "eng": "FAQ Categories",
                    "jpn": "分類(カテゴリ)"
                },
                {
                    "key": "faqCatDetailsButton",
                    "eng": "Detail",
                    "jpn": "Detail"
                },
                {
                    "key": "editBtn",
                    "eng": "Edit Questions",
                    "jpn": "質問を編集する"
                }
            ],
            "messages": [
                {
                    "key": "welcome message",
                    "eng": "Welcome",
                    "jpn": "いらっしゃいませ"
                }
            ],
            "notifications": []
        },

    ]',
    '20220201171220',
    '20220201171220'
);
