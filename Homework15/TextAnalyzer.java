package com.company.Homework15;

    public interface TextAnalyzer {
        /**
         * Counts the similarity between texts, provided by TextProviders
         *
         * @return coefficient of similarity
         */
        double analyze(TextProvider te1, TextProvider te2);
    }

