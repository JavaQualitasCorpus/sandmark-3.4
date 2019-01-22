package sandmark.watermark.gtw.eigen;
/*
 * QualitaCorpus.class: we included the package declaration
 * since it was missing.
 */

import cern.colt.matrix.DoubleMatrix1D;

public interface GraphListener {
    public abstract void graphChanged(Graph g, DoubleMatrix1D e, 
				      double a, double b, double sum);
}

