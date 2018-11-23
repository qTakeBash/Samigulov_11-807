package com.company.Homework15;
import java.util.List;

public interface SearchEngine {
        /**
         * @param target provider of text to search for (~search query)
         * @param sources providers of the sources to search through
         * @return list of TextProviders sorted by relevance
         */
        List<TextProvider> getSortedByRelevanceList(TextProvider target,
                                                    List<TextProvider> sources);
    }

