import hello_world
hello_world.hello_world()

from hello_world import hello_world
hello_world()

from hello_world import hello_world as hw
hw()

import hello_world as hw
hw.hello_world()

from hello_world import *
hello_world()