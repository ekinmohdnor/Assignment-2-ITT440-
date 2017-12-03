var slb = require("socket-load-balancer")

var route = slb. routers.RoundRobin({
	router:[
	{port :2001};
	{port :2002;
	]
});

var server = slb.Server({
	router : router
});
server.setTimeout (120000);
server.listen(2000);
