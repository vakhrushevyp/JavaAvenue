package lesson13;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List<Integer> result = new ArrayList<>();
        List<Integer> listA = new ArrayList<>(a);
        List<Integer> listB = new ArrayList<>(b);
        listA.retainAll(b);
        listB.retainAll(a);
        result.addAll(listA);
        result.addAll(listB);
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();
        Set<Integer> setA = new HashSet<>(a);
        Set<Integer> setB = new HashSet<>(b);
        setA.retainAll(b);
        setB.retainAll(a);
        result.addAll(setA);
        result.addAll(setB);
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List<Integer> result = new ArrayList<>();
        List<Integer> collectionA = new ArrayList<>(a);
        List<Integer> collectionB = new ArrayList<>(b);
        collectionA.removeAll(b);
        collectionB.removeAll(a);
        result.addAll(collectionA);
        result.addAll(collectionB);
        return result;
    }
}
