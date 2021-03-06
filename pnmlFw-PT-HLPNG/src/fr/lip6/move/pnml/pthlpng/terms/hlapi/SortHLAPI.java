/**
 *  Copyright 2009-2016 Université Paris Ouest and Sorbonne Universités,
							Univ. Paris 06 - CNRS UMR 7606 (LIP6)
 *
 *  All rights reserved.   This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Project leader / Initial Contributor:
 *    Lom Messan Hillah - <lom-messan.hillah@lip6.fr>
 *
 *  Contributors:
 *    ${ocontributors} - <$oemails}>
 *
 *  Mailing list:
 *    lom-messan.hillah@lip6.fr
 */
/**
 * (C) Sorbonne Universités, UPMC Univ Paris 06, UMR CNRS 7606 (LIP6)
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *    Lom HILLAH (LIP6) - Initial models and implementation
 *    Rachid Alahyane (UPMC) - Infrastructure and continuous integration
 *    Bastien Bouzerau (UPMC) - Architecture 
 *    Guillaume Giffo (UPMC) - Code generation refactoring, High-level API
 *
 * $Id ggiffo, Thu Feb 11 16:30:27 CET 2016$
 */
package fr.lip6.move.pnml.pthlpng.terms.hlapi;

import fr.lip6.move.pnml.framework.hlapi.HLAPIClass;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.Type;
import fr.lip6.move.pnml.pthlpng.hlcorestructure.hlapi.TypeHLAPI;
import fr.lip6.move.pnml.pthlpng.multisets.All;
import fr.lip6.move.pnml.pthlpng.multisets.Empty;
import fr.lip6.move.pnml.pthlpng.multisets.hlapi.AllHLAPI;
import fr.lip6.move.pnml.pthlpng.multisets.hlapi.EmptyHLAPI;
import fr.lip6.move.pnml.pthlpng.partitions.Partition;
import fr.lip6.move.pnml.pthlpng.partitions.hlapi.PartitionHLAPI;
import fr.lip6.move.pnml.pthlpng.terms.MultisetSort;
import fr.lip6.move.pnml.pthlpng.terms.NamedSort;
import fr.lip6.move.pnml.pthlpng.terms.ProductSort;
import fr.lip6.move.pnml.pthlpng.terms.VariableDecl;

public interface SortHLAPI extends HLAPIClass{

	//getters giving LLAPI object
	
	/**
	 *
	 */
	public MultisetSort getMulti();
	
	/**
	 *
	 */
	public NamedSort getContainerNamedSort();
	
	/**
	 *
	 */
	public VariableDecl getContainerVariableDecl();
	
	/**
	 *
	 */
	public ProductSort getContainerProductSort();
	
	/**
	 *
	 */
	public Type getContainerType();
	
	/**
	 *
	 */
	public All getContainerAll();
	
	/**
	 *
	 */
	public Empty getContainerEmpty();
	
	/**
	 *
	 */
	public Partition getContainerPartition();
	

	//getters giving HLAPI object
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public MultisetSortHLAPI getMultiHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public NamedSortHLAPI getContainerNamedSortHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public VariableDeclHLAPI getContainerVariableDeclHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public ProductSortHLAPI getContainerProductSortHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public TypeHLAPI getContainerTypeHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public AllHLAPI getContainerAllHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public EmptyHLAPI getContainerEmptyHLAPI();
		
	
	
	
	
		/**
		 * This accessor automaticaly encapsulate an element of the current object.
		 * WARNING : this creates a new object in memory.
		 */
		
		public PartitionHLAPI getContainerPartitionHLAPI();
		
	
	

	//setters (including container setter if aviable)
	
	
	/**
	 * set Multi
	 */
	public void setMultiHLAPI(
	MultisetSortHLAPI elem);
	
	/**
	 * set ContainerNamedSort
	 */
	public void setContainerNamedSortHLAPI(
	NamedSortHLAPI elem);
	
	/**
	 * set ContainerVariableDecl
	 */
	public void setContainerVariableDeclHLAPI(
	VariableDeclHLAPI elem);
	
	/**
	 * set ContainerProductSort
	 */
	public void setContainerProductSortHLAPI(
	ProductSortHLAPI elem);
	
	/**
	 * set ContainerType
	 */
	public void setContainerTypeHLAPI(
	TypeHLAPI elem);
	
	/**
	 * set ContainerAll
	 */
	public void setContainerAllHLAPI(
	AllHLAPI elem);
	
	/**
	 * set ContainerEmpty
	 */
	public void setContainerEmptyHLAPI(
	EmptyHLAPI elem);
	
	/**
	 * set ContainerPartition
	 */
	public void setContainerPartitionHLAPI(
	PartitionHLAPI elem);
	

	
	
	
	
	
	
	
	
	


	//setters/remover for lists.
	

	//equals method
	public boolean equals(Object item);

}