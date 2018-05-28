def print_models(unprinted_designs,completed_models):
    while unprinted_designs:
        current_design = unprinted_designs.pop()
        print("Printing model:" + current_design)
        completed_models.append(current_design)
def show_completed_modles(completed_modles):
    print("\nthe following models have been printed:")
    for completed_modle in completed_modles:
        print(completed_modle)