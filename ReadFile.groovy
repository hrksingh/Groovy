String filePath = 'txt_Files_for_IO/data.txt'
// or give complete file path and rither use \\(double back slash) or /(it is preferable as it will work in mac and linux also)
// String filePath = "C:\Users\DemoUser\Desktop\Groovy\data.txt"

File myFile = new File(filePath)
   
//reading entire content as String
println myFile.text

//collect lines into list
def list = myFile.collect {it}
println "list : $list"

//store file content in an array
def array = myFile as String[]
println "array : $array"

//read file into a list of String
def lines = myFile.readLines()
println "lines : $lines"

//read file line by line
myFile.eachLine {
    line, lineNo -> println "$lineNo line  : $line"
}

//read with reader
def line
myFile.withReader { reader ->
 while ((line = reader.readLine()) != null){
    println line
 }
}

//reading with new reader it does not close inputstream automatically
// it reads line char by char
def outputFile = "txt_Files_for_IO/outputData.txt"
def File = new File(outputFile)
def reader = myFile.newReader()
int data =  reader.read()
while(data != -1){
    char dataChar = (char) data;
    File.append(dataChar.toUpperCase())
    data = reader.read()
}
reader.close()