# GravitySim

This is an open source project that I started to create simple models of solar systems.
It currently only supports a simple 2D top down view using white circles to represent objects.
The user simply needs to click in the black space panel to create a new object. The object default size is 
approximately that of Earth's. Clicking and dragging allows for the creation of a much larger number of objects.
Objects that collide become a new larger object that is a merger of the two masses.

The slider bars can be used to change some physical properties of the objects being created. The mass can be set between 10 kg and
1E40 kg which is approximately that of the most massive known black holes. The radius can be set between 10 meters and 1E12 meters
which is about the size of the largest known star, UY Scutti. Objects can be given a velocity between 0 and 3.2E8 in both the x and y 
direction. The means that objects can travel substantially faster than the speed of light in this system.

A list of common objects have been added to the simulation. Clicking on the drop down and selecting an object sets the mass and radius to the approximate values of those objects. These currently include the Sun, the 8 planets, the Moon, and the only Kuiper Belt Object most people know, Pluto.

A speed slider allows the user to multiply the speed between 1x and 1,000,000x. Higher speeds tend to break the simulation. Notably, the acceleration of objects is a constant function but the objects have to be updated in steps. Smaller steps give a more accurate simulation. High speed multipliers increase the step size and cause orbits to destabalize faster. There is also an issue with collision. At high speeds, objects tend to pass entirely though each other without touching for an entire frame. The end result being that they slingshot each other across the solar system.

## Known Bugs/Future Features

There is currently no limit on how much gravity will accelerate objects, making breaking the speed of light no problem, which is
a problem.

Objects of different densities don't merge very nicely when they collide. They take an average of the densities of the objects that
collided, which isn't the most realistic.

Objects don't break into smaller objects when colliding with sufficient force.

