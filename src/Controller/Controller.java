package Controller;

import Model.Model;
import View.View;

public class Controller
{

    Model model;
    View view;
    int k = 0;

    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
    }
}
