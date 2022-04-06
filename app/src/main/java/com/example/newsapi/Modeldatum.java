package com.example.newsapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Modeldatum {

        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("total_hits")
        @Expose
        private Integer totalHits;
        @SerializedName("page")
        @Expose
        private Integer page;
        @SerializedName("total_pages")
        @Expose
        private Integer totalPages;
        @SerializedName("page_size")
        @Expose
        private Integer pageSize;
        @SerializedName("articles")
        @Expose
        private List<Artical> articles = null;
        @SerializedName("user_input")
        @Expose
        private UserInput userInput;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getTotalHits() {
            return totalHits;
        }

        public void setTotalHits(Integer totalHits) {
            this.totalHits = totalHits;
        }

        public Integer getPage() {
            return page;
        }

        public void setPage(Integer page) {
            this.page = page;
        }

        public Integer getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public List<Artical> getArticles() {
            return articles;
        }

        public void setArticles(List<Artical> articles) {
            this.articles = articles;
        }

        public UserInput getUserInput() {
            return userInput;
        }

        public void setUserInput(UserInput userInput) {
            this.userInput = userInput;
        }

    }
