File file = new File("txt_Files_for_IO/fileWriter.txt")

//ways to write in File

file.write("Writing using write() function \n")
file << "Writing using << operator \n"
file.append("Writing using append()")

// file.text = "This will overwrite the extising content"

/**
file.withWriter { writer ->
  writer.writeLine("Writer will also overwrite if used in exisiting written file")
}
*/

println file.length()
println file.isFile()
println file.isDirectory()
println file.isHidden()

//copy file
def newFile = new File("txt_Files_for_IO/copyFile.txt")
newFile << file.text