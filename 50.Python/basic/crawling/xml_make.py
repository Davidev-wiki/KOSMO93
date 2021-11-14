from xml.etree.ElementTree import Element, dump, ElementTree

root = Element("xml", kind="language")

node1 = Element("first")
node1.text = "안녕"
root.append(node1)

node2 = Element("second")
node2.text = "Hello"
root.append(node2)

#자료 출처 https://goo.gl/J8VoDK

def indent(elem, level=0):
    i = "\n" + level*"  "
    if len(elem):
        if not elem.text or not elem.text.strip():
            elem.text = i + "  "
        if not elem.tail or not elem.tail.strip():
            elem.tail = i
        for elem in elem:
            indent(elem, level+1)
        if not elem.tail or not elem.tail.strip():
            elem.tail = i
    else:
        if level and (not elem.tail or not elem.tail.strip()):
            elem.tail = i
indent(root)
dump(root)

ElementTree(root).write('./data/note.xml');

