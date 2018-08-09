package com.example.android.newsapppt1;

public class News {
    private String articleTitle, articleAuthor, articleDate, articleUrl;

    public News (String articleTitle, String articleAuthor, String articleDate, String articleUrl) {
        this.articleTitle = articleTitle;
        this.articleAuthor = articleAuthor;
        this.articleDate = articleDate;
        this.articleUrl = articleUrl;
    }

    public News(String author, long time, String url, long location, long time1, String url1) {
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

    public void add() {
    }
}
