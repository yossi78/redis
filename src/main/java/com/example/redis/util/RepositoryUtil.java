package com.example.redis.util;
import java.util.ArrayList;
import java.util.List;

public class RepositoryUtil {


    public static <T> List<T> convertIterableToList(Iterable<T> iterable) {
        List<T> list = new ArrayList<>();
        for (T item : iterable) {
            list.add(item);
        }
        return list;
    }

}
