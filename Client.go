package main

import (
	"io"
	"log"
	"net"
	"time"
)

func reader(r io.Reader){
	buf := make ([]byte,1024)
	for {
	n , err := r.Read (buf[:])
	if err != nil {
	return
	}
	println ("Client receive: ", string (buf[0:n])
	}
}

func main() {
	c ,err := net.Dial ("unix", "/tmp/echo.sock")
	if err != nil {
	panic(err)
	}
	defer c.Close()

	go reader(c)
	for {
	_,err = c.Write([]byte("Hai")
	if err != nil {
	log.Fatal("Write error: " , err)
	break
	}
	
	time.Sleep(1e9)
	}
}
