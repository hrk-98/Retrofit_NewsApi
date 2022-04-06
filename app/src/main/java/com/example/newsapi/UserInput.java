package com.example.newsapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInput {

        @SerializedName("q")
        @Expose
        private String q;
        @SerializedName("lang")
        @Expose
        private String lang;
        @SerializedName("from")
        @Expose
        private String from;
        @SerializedName("sort_by")
        @Expose
        private String sortBy;
        @SerializedName("page")
        @Expose
        private Integer page;
        @SerializedName("size")
        @Expose
        private Integer size;

        public String getQ() {
            return q;
        }

        public void setQ(String q) {
            this.q = q;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getSortBy() {
            return sortBy;
        }

        public void setSortBy(String sortBy) {
            this.sortBy = sortBy;
        }

        public Integer getPage() {
            return page;
        }

        public void setPage(Integer page) {
            this.page = page;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

    }
