package Iris.Forge.ModelRenderTMT;

import net.minecraft.util.*;

public abstract class TransformGroup
{
	public abstract double getWeight();
	public abstract Vec3 doTransformation(PositionTransformVertex vertex);
}
