package com.mms.mms

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        view.findViewById<Button>(R.id.button_login).setOnClickListener {
//            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
//        }

    }
}