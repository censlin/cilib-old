/**           __  __
 *    _____ _/ /_/ /_    Computational Intelligence Library (CIlib)
 *   / ___/ / / / __ \   (c) CIRG @ UP
 *  / /__/ / / / /_/ /   http://cilib.net
 *  \___/_/_/_/_.___/
 */
package net.sourceforge.cilib.pso.crossover.particleprovider;

import fj.data.List;
import net.sourceforge.cilib.algorithm.AbstractAlgorithm;
import net.sourceforge.cilib.algorithm.population.SinglePopulationBasedAlgorithm;

import net.sourceforge.cilib.entity.Topologies;
import net.sourceforge.cilib.entity.comparator.SocialBestFitnessComparator;
import net.sourceforge.cilib.pso.particle.Particle;

public class GBestParticleProvider extends ParticleProvider {

    @Override
    public Particle f(List<Particle> parents, Particle offspring) {
        return Topologies.getBestEntity((List<Particle>) ((SinglePopulationBasedAlgorithm) AbstractAlgorithm.get()).getTopology(), new SocialBestFitnessComparator());
    }

}
