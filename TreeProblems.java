/*
 * *** Jung Lee/ 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    // Create new TreeSet to hold result
    Set<Integer> result = new TreeSet<>(setA);
    
    //Add all elements from setB that are not in setA
    for (Integer element : setB) {
      if (!setA.contains(element)) {
        result.add(element);
      }
    }

    //Remove common elements
    for (Integer element : setA) {
      if (setB.contains(element)) {
        result.remove(element);
      }
    }

    return result;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    // Use an iterator to safely remove elements while iterating over the keys
    Iterator<Integer> iterator = treeMap.keySet().iterator();

    // Iterate over the keys of the TreeMap
    while (iterator.hasNext()) {
      Integer key = iterator.next();

      // If the key is even, remove the corresponding entry
      if (key % 2 == 0) {
        iterator.remove();

      }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    return tree1.equals(tree2);
  }

} // end treeProblems class
