package ch7;

interface ParseAble{
    void parse(String fileName);
}

class ParserManager{
    public static ParseAble getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLParser();
        }
    }
}

public class ParserTest {
    public static void main(String[] args) {
        ParseAble parser = ParserManager.getParser("XML");
        parser = ParserManager.getParser("HTML");
    }
}

class XMLParser implements ParseAble {
    @Override
    public void parse(String fileName) {
        System.out.println("XMLParser.parse");
        System.out.println("fileName = " + fileName);
    }
}

class HTMLParser implements ParseAble {
    @Override
    public void parse(String fileName) {
        System.out.println("HTMLParser.parse");
        System.out.println("fileName = " + fileName);
    }
}