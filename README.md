# GravitySim

This is an open source project that I started to create simple models of solar systems.
It currently only supports a simple 2D top down view using white circles to represent objects.
The user simply needs to click in the black space panel to create a new object. The object default size is 
approximately that of Earth's. Clicking and dragging allows for the creation of a much larger number of objects.
Objects that collide become a new larger object that is a merger of the two masses.

The current master branch starts with G set to 6.675E-6 which is 10,000 times stronger than the actual
gravity constant. This was done to speed up the simulation. The gravity constant can be edited and changed to the actual 6.675E-11
if desired.

The slider bars can be used to change some physical properties of the objects being created. The mass can be set between 10 kg and
1E40 kg which is approximately that of the most massive known black holes. The radius can be set between 10 meters and 1E12 meters
which is about the size of the largest known star, UY Scutti. Objects can be given a velocity between 0 and 3.2E8 in both the x and y 
direction. The means that objects can travel substantially faster than the speed of light in this system.

## Known Bugs/Future Features

There is currently no limit on how much gravity will accelerate objects, making breaking the speed of light no problem, which is
a problem.

Objects of different densities don't merge very nicely when they collide. They take an average of the densities of the objects that
collided, which isn't the most realistic.

Objects don't break into smaller objects when colliding with sufficient force.

