package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 베스트앨범 {

    class Solution {
        public int[] solution(String[] genres, int[] plays) {
            // GenreInfo 객체 리스트 생성
            List<GenreInfo> genreInfoList = new ArrayList<>();

            // GenreInfo 객체를 생성하고 리스트에 추가
            for (int i = 0; i < genres.length; i++) {
                GenreInfo genreInfo = new GenreInfo(genres[i], i, plays[i]);
                genreInfoList.add(genreInfo);
            }

            // type별 playCount의 총합으로 정렬
            List<GenreInfo> sortedByTotalPlayCount = genreInfoList.stream()
                    .collect(Collectors.groupingBy(GenreInfo::getType, Collectors.summingInt(GenreInfo::getPlayCount)))
                    .entrySet().stream()
                    .map(entry -> new GenreInfo(entry.getKey(), -1, entry.getValue()))
                    .sorted(Comparator.comparingInt(GenreInfo::getPlayCount).reversed())
                    .collect(Collectors.toList());

            // type별로 playCount가 높은 두 가지의 index를 추출
            List<Integer> resultIndexes = new ArrayList<>();
            for (GenreInfo genreInfo : sortedByTotalPlayCount) {
                List<Integer> indexes = genreInfoList.stream()
                        .filter(info -> info.getType().equals(genreInfo.getType()))
                        .sorted(Comparator.comparingInt(GenreInfo::getPlayCount).reversed())
                        .limit(2)
                        .map(GenreInfo::getIndex)
                        .collect(Collectors.toList());

                resultIndexes.addAll(indexes);
            }

            // List<Integer>을 int[]로 변환
            return resultIndexes.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    class GenreInfo implements Comparable<GenreInfo> {
        private String type;
        private int index;
        private int playCount;

        public GenreInfo(String type, int index, int playCount) {
            this.type = type;
            this.index = index;
            this.playCount = playCount;
        }

        public String getType() {
            return type;
        }

        public int getIndex() {
            return index;
        }

        public int getPlayCount() {
            return playCount;
        }

        @Override
        public int compareTo(GenreInfo other) {
            return Integer.compare(other.playCount, this.playCount);
        }
    }
}
