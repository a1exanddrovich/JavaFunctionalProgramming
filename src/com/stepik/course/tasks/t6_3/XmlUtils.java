package com.stepik.course.tasks.t6_3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class XmlUtils {

    public static Map<String, Long> countAllByTagName(List<XmlFile> files, String tagName) {
        return files
                .stream()
                .collect(Collectors.groupingBy(
                        XmlFile::getEncoding,
                        Collectors.filtering(
                                xmlFile -> xmlFile.getTags().contains(new Tag(tagName)),
                                Collectors.summingLong(file -> file.getTags().size())
                        ))
                );
    }

    public static void main(String[] args) {
        List<XmlFile> xmlFiles = List.of(
                new XmlFile("1", "UTF-8", List.of(new Tag("function"), new Tag("load"))),
                new XmlFile("2", "UTF-8", List.of(new Tag("table"), new Tag("main"))),
                new XmlFile("3", "ASCII", List.of(new Tag("row"), new Tag("column"))),
                new XmlFile("4", "ASCII", List.of(new Tag("sheet"), new Tag("row"))),
                new XmlFile("5", "ASCII", List.of(new Tag("sheet"), new Tag("column"), new Tag("row")))
        );

        System.out.println(countAllByTagName(xmlFiles, "sheet"));
    }

}
