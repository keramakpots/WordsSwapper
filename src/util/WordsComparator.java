package util;

import java.util.ArrayList;
import java.util.List;

//method to compare words length and Hamming distance
public class WordsComparator {

    public boolean areWordsTheSameLength(String firstComparableString, String secondComparableString) {
        return firstComparableString.length() == secondComparableString.length();
    }

    public boolean areWordsDifferentByOneWord(String firstComparableString,
        String secondComparableString) {
        char[] baseChars = firstComparableString.toCharArray();
        char[] checkChars = secondComparableString.toCharArray();
        int diffLetters = 0;

        if (baseChars.length != checkChars.length) {
            return false;
        }

        for (int i = 0; i < baseChars.length; i++) {
            if (baseChars[i] != checkChars[i]) {
                diffLetters++;
            }
        }

        if (diffLetters == 1) {
            return true;
        } else {
            return false;
        }
    }

    public List<String> getSameLengthWords(List<String> strings, int desired_length) {
        List<String> list1 = new ArrayList<>();
        for (String st : strings) {
            if (st.length() == desired_length) {
                list1.add(st);
            }
        }
        return list1;
    }
}
