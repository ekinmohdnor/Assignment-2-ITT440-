package main

import "net";
import "fmt";

func echoServer(c net.Conn){
	for {
	buf : = make ([]byte,512)
	nr,err ! = nil {
	return
	}

	data:= buf[0:nr]
	println("Server accept:", string (data))
	_,err = c.Write(data)
	if err ! = nil{
	log.Fatal("Write: " , err)
	}
       }
}

func main() {
	l,err := net.Listen("unix", "/tmp/echo.sock")
	if err != nil {
	log.Fatal("listen error: " , err)
	}

	for {
	fd,err := 1.Accept()
	if err != nil {
	log.Fatal("accept error: " , err)
	}

	go echoServer(fd)
	}
}
