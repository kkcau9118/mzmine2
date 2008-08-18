package net.sf.mzmine.modules.peakpicking.threestep.peakconstruction.savitzkygolay;

public final class SGCoefficients {
	
	public static final float[][] SGCoefficientsFirstDerivative = {
		{ 0.0f },
		{ 0.0f, 0.500f },
		{ 0.0f, 0.100f, 0.200f },
		{ 0.0f, 0.036f, 0.071f, 0.107f },
		{ 0.0f, 0.017f, 0.033f, 0.050f, 0.067f },
		{ 0.0f, 0.009f, 0.018f, 0.027f, 0.036f, 0.045f },
		{ 0.0f, 0.005f, 0.011f, 0.016f, 0.022f, 0.027f, 0.033f },
		{ 0.0f, 0.004f, 0.007f, 0.011f, 0.014f, 0.018f, 0.021f,
				0.025f },
		{ 0.0f, 0.002f, 0.005f, 0.007f, 0.010f, 0.012f, 0.015f,
				0.017f, 0.020f },
		{ 0.0f, 0.002f, 0.004f, 0.005f, 0.007f, 0.009f, 0.011f,
				0.012f, 0.014f, 0.016f },
		{ 0.0f, 0.001f, 0.003f, 0.004f, 0.005f, 0.006f, 0.008f,
				0.009f, 0.010f, 0.012f, 0.013f },
		{ 0.0f, 0.001f, 0.002f, 0.003f, 0.004f, 0.005f, 0.006f,
				0.007f, 0.008f, 0.009f, 0.010f, 0.011f },
		{ 0.0f, 0.001f, 0.002f, 0.002f, 0.003f, 0.004f, 0.005f,
				0.005f, 0.006f, 0.007f, 0.008f, 0.008f, 0.009f } };

	public static final float[][] SGCoefficientsFirstDerivativeQuartic = {
		{ 0.0f },
		{ 0.0f, 0.667f },
		{ 0.0f, 0.667f, -0.083f },
		{ 0.0f, 0.230f, 0.266f, -0.087f },
		{ 0.0f, 0.106f, 0.162f, 0.120f, -0.072f },
		{ 0.0f, 0.057f, 0.098f, 0.103f, 0.057f, -0.058f },
		{ 0.0f, 0.035f, 0.062f, 0.075f, 0.066f, 0.027f, -0.047f },
		{ 0.0f, 0.022f, 0.041f, 0.053f, 0.055f, 0.042f, 0.012f,
				-0.039f },
		{ 0.0f, 0.015f, 0.029f, 0.039f, 0.043f, 0.040f, 0.028f,
				0.004f, -0.032f },
		{ 0.0f, 0.011f, 0.021f, 0.029f, 0.034f, 0.034f, 0.029f,
				0.018f, 0.000f, -0.027f },
		{ 0.0f, 0.008f, 0.016f, 0.022f, 0.026f, 0.028f, 0.027f,
				0.022f, 0.012f, -0.003f, -0.023f },
		{ 0.0f, 0.006f, 0.012f, 0.017f, 0.021f, 0.023f, 0.023f,
				0.021f, 0.016f, 0.008f, -0.004f, -0.020f },
		{ 0.0f, 0.006f, 0.009f, 0.013f, 0.017f, 0.019f, 0.020f,
				0.019f, 0.016f, 0.012f, 0.005f, -0.005f, -0.017f } };

	
	public static final float[][] SGCoefficientsSecondDerivative = {
			{ 0.0f },
			{ -1.0f, 0.5f },
			{ -0.143f, -0.071f, 0.143f },
			{ -0.048f, -0.036f, 0.0f, 0.060f },
			{ -0.022f, -0.018f, -0.009f, 0.008f, 0.030f },
			{ -0.012f, -0.010f, -0.007f, -0.001f, 0.007f, 0.017f },
			{ -0.007f, -0.006f, -0.005f, -0.002f, 0.001f, 0.005f, 0.011f },
			{ -0.005f, -0.004f, -0.004f, -0.002f, -0.001f, 0.002f, 0.004f,
					0.007f },
			{ -0.003f, -0.003f, -0.003f, -0.002f, -0.001f, 0.000f, 0.002f,
					0.003f, 0.005f },
			{ -0.002f, -0.002f, -0.002f, -0.002f, -0.001f, 0.000f, 0.000f,
					0.001f, 0.003f, 0.004f },
			{ -0.002f, -0.002f, -0.001f, -0.001f, -0.001f, -0.001f, 0.000f,
					0.001f, 0.001f, 0.002f, 0.003f },
			{ -0.001f, -0.001f, -0.001f, -0.001f, -0.001f, -0.001f, 0.000f,
					0.000f, 0.001f, 0.001f, 0.002f, 0.002f },
			{ -0.001f, -0.001f, -0.001f, -0.001f, -0.001f, -0.001f, 0.000f,
					0.000f, 0.000f, 0.001f, 0.001f, 0.001f, 0.002f } };

	public static final float[][] SGCoefficientsSecondDerivativeQuartic = {
		{ 0.0f },
		{ -1.250f, 0.567f },
		{ -1.250f, 0.567f, -0.042f },
		{ -0.265f, -0.072f, 0.254f, -0.049f },
		{ -0.108f, -0.061f, -0.044f, 0.108f, -0.037f },
		{ -0.055f, -0.040f, 0.000f, 0.043f, 0.051f, -0.026f },
		{ -0.032f, -0.026f, -0.008f, 0.014f, 0.030f, 0.025f, -0.019f },
		{ -0.021f, -0.018f, -0.009f, 0.003f, 0.014f, 0.020f, 0.013f,
				-0.014f },
		{ -0.014f, -0.012f, -0.008f, -0.001f, 0.006f, 0.012f, 0.013f,
				0.007f, -0.011f },
		{ -0.010f, -0.009f, -0.006f, -0.002f, 0.002f, 0.007f, 0.009f,
				0.009f, 0.004f, -0.008f },
		{ -0.007f, -0.007f, -0.005f, -0.003f, 0.000f, 0.003f, 0.006f,
				0.007f, 0.006f, 0.002f, -0.006f },
		{ -0.006f, -0.005f, -0.004f, -0.003f, -0.001f, 0.002f, 0.004f,
				0.005f, 0.005f, 0.004f, 0.001f, -0.005f },
		{ -0.004f, -0.004f, -0.003f, -0.002f, -0.001f, 0.001f, 0.002f,
				0.003f, 0.004f, 0.004f, 0.003f, 0.000f, -0.004f } };
	

}
