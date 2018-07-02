players = ['charles','martina','michael','florence','eli']
print(players[0:3])
print(players[1:4])
#从列表头开始提取
print(players[:4])
#提取到列表尾
print(players[2:])
#负数索引返回离列表末尾相应距离的元素
print(players[-3:])
for player in players[:3]:
	print(player.title())