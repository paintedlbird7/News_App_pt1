package com.example.android.newsapppt1;

public class News {
    private String articleTitle, articleAuthor, articleDate, articleUrl;

    public News (String articleTitle, String articleAuthor, String articleDate, String articleUrl) {
        this.articleTitle = articleTitle;
        this.articleAuthor = articleAuthor;
        this.articleDate = articleDate;
        this.articleUrl = articleUrl;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public String getArticleUrl() {
        return articleUrl;
    }
}
