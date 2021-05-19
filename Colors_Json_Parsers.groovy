import groovy.json.JsonSlurper

//Parsing Json
def jsonSlurper = new JsonSlurper()
def movie_json = new File('txt_Files_for_IO/colors.json').text
def root = jsonSlurper.parseText(movie_json)

//Collecting all data
def colorNode = root.colors
def Size = colorNode.size()
def colorList =  colorNode.color
def categoryList =  colorNode.category
def typeList =  colorNode.type
def rgbaList =  colorNode.code.rgba
def hexList =  colorNode.code.hex
String[] headers = ["Color", "Category", "Type", "Code.Hex", "Code.Rgba"]

// Header - Footer Pattern Printer
def hfPrinter(String[] headers){
 for (header in headers) {
    print "+" + "-" * 20
  }
 print "+ \n"
}

//Printing Header
hfPrinter(headers)
print "|" + " ${headers[0]}".padRight(20) +
      "|" + " ${headers[1]}".padRight(20) +
      "|" + " ${headers[2]}".padRight(20) +
      "|" + " ${headers[3]}".padRight(20) +
      "|" + " ${headers[4]}".padRight(20) + "| \n"

hfPrinter(headers)


//printing body

(0..<Size).each{

print "|" + " ${colorList[it]}".padRight(20) +
      "|" + " ${categoryList[it]}".padRight(20) +
      "|" + " ${typeList[it]}".padRight(20) +
      "|" + " ${hexList[it]}".padRight(20) +
      "|" + " ${rgbaList[it]}".padRight(20) + "| \n"

hfPrinter(headers)

}


