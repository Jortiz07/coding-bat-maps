package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*

import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import edu.cnm.deepdive.CodingBatMaps

class CodingBatMapsTest {

  private static Object[][] mapAB4() {
    return new Object[][]{
        mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}	{"a": "aaa", "b": "bb", "c": "aaa"}	OK
    mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}	{"a": "aa", "b": "bbb", "c": "bbb"}	OK
    mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}	{"a": "aa", "b": "bbb", "c": "bbb"}	OK
    mapAB4({"a": "aaa"}) → {"a": "aaa"}	{"a": "aaa"}	OK
    mapAB4({"b": "bbb"}) → {"b": "bbb"}	{"b": "bbb"}	OK
    mapAB4({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "", "b": "", "c": "cake"}	{"a": "", "b": "", "c": "cake"}	OK
    mapAB4({"a": "a", "b": "b", "c": "cake"}) → {"a": "", "b": "", "c": "cake"}	{"a": "", "b": "", "c": "cake"}	OK
    mapAB4({"a": "", "b": "b", "c": "cake"}) → {"a": "", "b": "b", "c": "b"}	{"a": "", "b": "b", "c": "b"}	OK
    mapAB4({"a": "a", "b": "", "c": "cake"}) → {"a": "a", "b": "", "c": "a"}	{"a": "a", "b": "", "c": "a"}	OK
    mapAB4({"c": "cat", "d": "dog"}) → {"c": "cat", "d": "dog"}	{"c": "cat", "d": "dog"}	OK
    mapAB4({"ccc": "ccc"}) → {"ccc": "ccc"}	{"ccc": "ccc"}	OK
    mapAB4({"c": "a", "d": "b"}) → {"c": "a", "d": "b"}	{"c": "a", "d": "b"}	OK
    mapAB4({}) → {}	{}	OK
    mapAB4({"a": "", "z": "z"}) → {"a": "", "z": "z"}	{"a": "", "z": "z"}	OK
    mapAB4({"b": "", "z": "z"}) → {"b": "", "z": "z"}	{"b": "", "z": "z"}
    };
  }

  @ParameterizedTest
  @MethodSource
  void mapAB4(Map<String, String> map, Map<String, String> expected) {
    assertEquals(expected, CodingBatMaps);
  }
}